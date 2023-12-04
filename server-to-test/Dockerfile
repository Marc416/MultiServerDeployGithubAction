FROM eclipse-temurin:17
WORKDIR /app
COPY . .

CMD ./gradlew build -x test
#WORKDIR build/libs
CMD cp ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar .
#RUN chmod 644 server-to-test-0.0.1-SNAPSHOT.jar
CMD chmod 644 /opt/java/openjdk/bin/java
ENTRYPOINT ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
