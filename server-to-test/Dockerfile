FROM eclipse-temurin:17-jre
WORKDIR /app
COPY . .

CMD ./gradlew build -x test
#WORKDIR build/libs
CMD cp ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar .
CMD chmod 777 server-to-test-0.0.1-SNAPSHOT.jar
CMD chmod 644 /opt/java/openjdk/bin/java
CMD ls -al
CMD ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
