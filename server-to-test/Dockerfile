FROM openjdk:17
WORKDIR /app
COPY . .

CMD chmod 644 ./gradlew
CMD sudo ./gradlew build -x test
COPY . .
CMD ls -al
#CMD cp ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
