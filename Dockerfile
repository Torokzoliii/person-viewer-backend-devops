FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY target/person-viewer-backend.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]