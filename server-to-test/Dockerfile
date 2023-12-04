FROM eclipse-temurin:17-jre
WORKDIR /app
COPY . .

CMD ls -al
CMD chmod 644 /build/libs/server-to-test-0.0.1-SNAPSHOT.jar app.jar
#CMD cd ..
#CMD ls -al
#CMD cp ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","./build/libs/server-to-test-0.0.1-SNAPSHOT.jar app.jar"]
#CMD ls -al
