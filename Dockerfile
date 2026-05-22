FROM amazoncorretto:21-alpine

WORKDIR /app

# Copiar el JAR ya compilado por GitHub Actions
COPY target/localserver-*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
