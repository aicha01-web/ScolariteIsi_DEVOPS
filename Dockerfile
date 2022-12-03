FROM openjdk:17
ADD target/scolariteisi-0.0.1-SNAPSHOT.jar scolariteisi.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "scolariteisi.jar"]