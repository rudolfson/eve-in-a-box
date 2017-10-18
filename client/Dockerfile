#
# Dockerfile for creating an nginx server serving the client app.
#

# This is a multi-stage build (see https://docs.docker.com/engine/userguide/eng-image/multistage-build/)
# First build the minified app using webpack
FROM node:alpine as builder
LABEL maintainer leonty.alkaev@gmail.com

COPY package.json package-lock.json /work/
WORKDIR /work
RUN npm install

COPY ./ /work
RUN npm run build

# create the nginx server and put the files built previously in there
FROM nginx:alpine

COPY --from=builder /work/dist/ /dist/
COPY nginx-client.conf /etc/nginx/conf.d/default.conf
