#define base docker image
# 1. Adım: Temel imajı belirleyin

FROM openjdk:22-jdk-slim

LABEL maintainer="cursorSoftware.com"
COPY ./target/studentRegService-0.0.1-SNAPSHOT.jar studentRegService-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","studentRegService-0.0.1-SNAPSHOT.jar"]

