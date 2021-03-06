FROM adoptopenjdk/openjdk15-openj9
RUN apt-get update && apt-get upgrade -y
RUN useradd -ms /bin/bash pryzintul
USER pryzintul
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8090
ENTRYPOINT ["java","-Xmx4096m","-Xms1024m","-XX:-TieredCompilation","-XX:+UseContainerSupport","-XX:+UseStringDeduplication", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]