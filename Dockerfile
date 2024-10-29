FROM alpine:3

RUN apk update && apk upgrade && apk --no-cache add openjdk21