FROM eclipse-temurin:17
WORKDIR /app
COPY . .

RUN ./gradlew build -x test
#WORKDIR build/libs
RUN cp ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar .
#RUN chmod 644 server-to-test-0.0.1-SNAPSHOT.jar
CMD chmod +x /opt/java/openjdk/bin/java
CMD ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
