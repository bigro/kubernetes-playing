FROM adoptopenjdk/openjdk11:latest as builder
WORKDIR /opt/work/kubernetes-playing
COPY . .
RUN ./gradlew build

FROM adoptopenjdk/openjdk11:latest as runner
WORKDIR /home/app
COPY --from=builder /opt/work/kubernetes-playing/build/libs/kubernetes-playing-0.0.1-SNAPSHOT.jar ./kubernetes-playing.jar
CMD ["java", "-jar", "/home/app/kubernetes-playing.jar"]