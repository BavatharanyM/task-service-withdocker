FROM eclipse-temurin:17-jre

COPY target/task-service-withdocker.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]