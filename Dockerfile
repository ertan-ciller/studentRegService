#define base docker image
# 1. Adım: Temel imajı belirleyin

FROM openjdk:22-jdk-slim

LABEL maintainer = "cursorsoftware.com"
# 2. Adım: Çalışma dizinini ayarlayın
WORKDIR /app

# 3. Adım: Maven wrapper dosyalarını ve pom.xml'i kopyalayın
COPY mvnw .
COPY .mvn .mvn

# 4. Adım: pom.xml'i kopyalayın
COPY pom.xml .

# 5. Adım: Maven bağımlılıklarını indirip cache'leyin
RUN ./mvnw dependency:go-offline

# 6. Adım: Uygulama kaynaklarını kopyalayın
COPY src ./src

# 7. Adım: Projeyi build edin
RUN ./mvnw clean package -DskipTests

# 8. Adım: Uygulamayı çalıştırın
CMD ["java", "-jar", "target/studentRegService-0.0.1-SNAPSHOT.jar"]
