FROM openjdk:17-slim

COPY target/fibonacci-maven-tso-1.0-SNAPSHOT.jar /app.jar

CMD ["java", "-jar", "/app.jar", "9"]