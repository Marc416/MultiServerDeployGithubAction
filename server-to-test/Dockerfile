FROM eclipse-temurin:17-jre
WORKDIR /app
COPY . .

CMD ./gradlew build -x test
#WORKDIR build/libs
CMD cp /build/libs/server-to-test-0.0.1-SNAPSHOT.jar .
#CMD chmod 644 /app/server-to-test-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-jar","/app/server-to-test-0.0.1-SNAPSHOT.jar"]
