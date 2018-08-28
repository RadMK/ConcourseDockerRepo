FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY target/spring-boot-2-rest-service-basic-0.0.1-SNAPSHOT.jar spring-boot-2-rest-service.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-2-rest-service.jar"]