#
# Dockerfile for the rest-api
#
FROM openjdk:8-alpine
LABEL maintainer leonty.alkaev@gmail.com

COPY /build/libs/rest-api-0.0.1.war /app/

WORKDIR /app

CMD java -jar rest-api-0.0.1.war
