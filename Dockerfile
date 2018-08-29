FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} spring-boot-2-rest-service.jar
RUN sh -c 'touch /spring-boot-2-rest-service.jar'
ENTRYPOINT ["java", "-jar", "/spring-boot-2-rest-service.jar"]