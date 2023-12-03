FROM openjdk:17
WORKDIR /app
COPY . /app
CMD ./gradlew build -x test
CMD chmod +x ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar.jar
ENTRYPOINT ["java","-jar","./build/libs/server-to-test-0.0.1-SNAPSHOT.jar"]
