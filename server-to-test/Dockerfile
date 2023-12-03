FROM openjdk:17
WORKDIR /app
COPY . .
CMD ./gradlew build -x test
COPY ./build/libs/*.jar ./
#CMD chmod +x ./server-to-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","./server-to-test-0.0.1-SNAPSHOT.jar"]
