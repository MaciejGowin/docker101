FROM openjdk:17-oracle
WORKDIR app

COPY target/docker-spring-boot-jpa-compose-1.0-SNAPSHOT.jar app.jar

COPY entrypoint.sh entrypoint.sh

ENTRYPOINT ["./entrypoint.sh"]