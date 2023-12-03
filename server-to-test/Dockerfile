FROM openjdk:17-oracle
WORKDIR /app
COPY . .

#RUN microdnf install findutils
RUN chmod +x ./gradlew
RUN ./gradlew build -x test
WORKDIR build/libs
#CMD cd ./build/libs
#RUN chmod +x ./build/libs/*.jar
RUN chmod +x server-to-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
