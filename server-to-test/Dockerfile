FROM openjdk:17
#FROM eclipse-temurin:17-jre
WORKDIR /app
COPY . .
RUN echo "빌드시작"
RUN chmod +x gradlew
RUN ./gradlew build
ENTRYPOINT ["java","-jar","./build/libs/server-to-test-0.0.1-SNAPSHOT.jar"]
