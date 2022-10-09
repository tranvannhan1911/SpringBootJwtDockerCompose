FROM adoptopenjdk/openjdk11:alpine

WORKDIR /app

COPY target/ongiuaky-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "/app/ongiuaky-0.0.1-SNAPSHOT.jar"]