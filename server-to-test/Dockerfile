FROM arm32v7/eclipse-temurin:17-jammy
WORKDIR /app
COPY . .

RUN chmod 644 ./gradlew
CMD sudo ./gradlew build -x test
COPY . .
CMD ls -al
#CMD cp ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["./gradlew","build","-x","test"]
CMD ls -al
#ENTRYPOINT ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
