FROM eclipse-temurin:17-jre
WORKDIR /app
COPY . .

CMD chmod 644 ./gradlew
CMD sudo ./gradlew build -x test
#CMD ls -al
#CMD cd ..
#CMD ls -al
#CMD cp ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["./gradlew","build","-x","test"]
RUN ["java","-jar","./build/libs/server-to-test-0.0.1-SNAPSHOT.jar app.jar"]
#CMD ls -al
