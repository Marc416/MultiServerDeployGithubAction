FROM openjdk:17
WORKDIR /app
COPY . .
RUN ./gradlew build -x test
RUN chmod +x ./build/libs/*.jar
ENTRYPOINT ["java","-jar","./build/libs/server-to-test-0.0.1-SNAPSHOT.jar"]
