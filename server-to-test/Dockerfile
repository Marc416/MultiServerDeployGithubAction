FROM openjdk:17
WORKDIR /app
COPY . .
CMD ./gradlew build -x test
ENTRYPOINT ["java","-jar","./build/libs/server-to-test-0.0.1-SNAPSHOT.jar"]
