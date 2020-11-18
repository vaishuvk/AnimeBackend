FROM openjdk:8

ADD target/Anime-0.0.1-SNAPSHOT.jar Anime-0.0.1-SNAPSHOT.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "Anime-0.0.1-SNAPSHOT.jar"]
