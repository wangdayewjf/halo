FROM openjdk:8-jre-alpine

VOLUME /tmp
ARG PROJECT_VERSION=1.0.2
ARG JAR_FILE=build/libs/halo-${PROJECT_VERSION}.jar
ARG PORT=8090
ARG TIME_ZONE=Asia/Shanghai

ENV TZ=${TIME_ZONE}

COPY ${JAR_FILE} halo.jar

EXPOSE ${PORT}

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","halo.jar"]