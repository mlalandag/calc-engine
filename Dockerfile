FROM adoptopenjdk/openjdk15-openj9
RUN apt-get update && apt-get upgrade -y
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} target/app.jar
EXPOSE 8090
ENTRYPOINT ["java","-Xmx4096m","-Xms1024m","-XX:-TieredCompilation","-XX:+UseContainerSupport","-XX:+UseStringDeduplication", "-Djava.security.egd=file:/dev/./urandom","-jar","target/app.jar"]