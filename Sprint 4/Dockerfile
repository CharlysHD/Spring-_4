<<<<<<< HEAD
FROM alpine:latest as build
RUN apk update
RUN apk add openjdk17

COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew bootJar --no-daemon

FROM openjdk:17-alpine
EXPOSE 9000
COPY --from=build ./build/libs/Spring3-0.0.1-SNAPSHOT.jar ./app.jar

=======
FROM alpine:latest as build
RUN apk update
RUN apk add openjdk17

COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew bootJar --no-daemon

FROM openjdk:17-alpine
EXPOSE 9000
COPY --from=build ./build/libs/Spring3-0.0.1-SNAPSHOT.jar ./app.jar

>>>>>>> e6cc6e5 (agrego controladores y servicios y las querys)
ENTRYPOINT ["java", "-jar", "app.jar"]