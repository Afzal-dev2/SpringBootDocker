FROM openjdk:17
COPY target/learnspringboot-0.0.1-SNAPSHOT.jar learnspringboot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/learnspringboot-0.0.1-SNAPSHOT.jar"]