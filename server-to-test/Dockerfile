FROM openjdk:17
WORKDIR /app
COPY . .
CMD ./gradlew build -x test
RUN cp ./build/libs/*.jar ./
#RUN chmod +x ./build/libs/*.jar
ENTRYPOINT ["java","-jar","./server-to-test-0.0.1-SNAPSHOT.jar"]
