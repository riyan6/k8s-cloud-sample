FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/service-c.jar app.jar
EXPOSE 28800
ENTRYPOINT ["java", "-jar", "app.jar"]