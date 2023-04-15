FROM gradle:jdk17 as BUILD
WORKDIR /app
COPY src ./src
COPY build.gradle.kts ./build.gradle.kts
# RUN --mount=type=cache,target=./.gradle gradle clean test install

FROM openjdk:17 as backend
WORKDIR /root
COPY --from=BUILD /app/build/install/app ./
