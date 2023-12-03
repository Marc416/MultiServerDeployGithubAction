FROM openjdk:17
WORKDIR /app
COPY . .
CMD ./gradlew build -x test
WORKDIR build/libs
#CMD cd ./build/libs
#RUN chmod +x ./build/libs/*.jar
RUN ls -al
RUN chmod 777 server-to-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
