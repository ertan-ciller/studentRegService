#define base docker image

FROM openjdk:17
LABEL maintainer="cursorSoftware.com"
COPY target/studentRegService-0.0.1-SNAPSHOT.jar studentRegService.jar
ENTRYPOINT ["java","-jar","studentRegService.jar"]