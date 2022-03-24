FROM openjdk:16
LABEL maintainer="beyzanur";

EXPOSE 8085

ADD target/serseribf-0.0.1-SNAPSHOT.jar springboot-docker.jar

ENTRYPOINT [ "java", "-jar", "springboot-docker.jar"]
