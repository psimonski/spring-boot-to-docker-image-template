FROM openjdk:8-jdk-alpine
MAINTAINER Simon Pfeifer
VOLUME /tmp
ADD spring-boot-to-docker-image.jar spring-boot-to-docker-image.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-to-docker-image.jar"]

# -- DEBUGGING --
# EXPOSE 5005
# ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005 -Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-to-docker-image.jar"]