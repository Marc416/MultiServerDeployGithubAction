FROM eclipse-temurin:17
WORKDIR /app
COPY . .

RUN ls
RUN chmod 644 gradlew
RUN ./gradlew build -x test
#WORKDIR build/libs
RUN cp ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar .
#RUN chmod 644 server-to-test-0.0.1-SNAPSHOT.jar
RUN chmod 644 /opt/java/openjdk/bin/java
ENTRYPOINT ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
