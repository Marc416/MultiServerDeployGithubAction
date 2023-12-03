FROM openjdk:17
WORKDIR /app
COPY . .
CMD ./gradlew build -x test
CMD chmod +x ./build/libs/*.jar
ENTRYPOINT ["java","-jar","/app/build/libs/server-to-test-0.0.1-SNAPSHOT.jar"]
