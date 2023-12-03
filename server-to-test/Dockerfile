FROM openjdk:17
WORKDIR /app
COPY . .
CMD ./gradlew build -x test
COPY ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar server-to-test-0.0.1-SNAPSHOT.jar
#CMD chmod +x ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar.jar
ENTRYPOINT ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
