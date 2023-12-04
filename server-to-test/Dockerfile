FROM eclipse-temurin:17-jre
WORKDIR /app
COPY . .

CMD ./gradlew build -x test
#WORKDIR build/libs
CMD chmod 644 /build/libs/server-to-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","./build/libs/server-to-test-0.0.1-SNAPSHOT.jar"]
