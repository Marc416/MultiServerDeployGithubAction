FROM openjdk:17
WORKDIR /app
COPY . .
CMD chmod +x ./gradlew
CMD ./gradlew build -x test
CMD cp ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar server-to-test-0.0.1-SNAPSHOT.jar
#CMD chmod +x ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar.jar
ENTRYPOINT ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
