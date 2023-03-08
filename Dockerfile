FROM openjdk:8-jdk-alpine

# default values for dd.env, dd.version, etc
ENV  ENV=dev VERSION=1.0 PORT=8081 PROFILE=default

LABEL com.datadoghq.tags.env="$ENV"
LABEL com.datadoghq.tags.service="grades-service"
LABEL com.datadoghq.tags.version="$VERSION"

VOLUME /tmp
RUN apk --no-cache add curl
RUN wget -O dd-java-agent.jar https://dtdg.co/latest-java-tracer
COPY target/*.jar grades-service.jar
COPY run.sh run.sh

ENTRYPOINT ["sh", "run.sh"]