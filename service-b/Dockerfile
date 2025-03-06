FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/your-app.jar app.jar
EXPOSE 28810
ENTRYPOINT ["java", "-jar", "app.jar"]