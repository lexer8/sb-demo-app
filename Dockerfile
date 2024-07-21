FROM eclipse-temurin:21-jdk-jammy

COPY target/app.jar app.jar
COPY entrypoint.sh /

RUN chmod 0755 /entrypoint.sh

ENV JVM_OPTS "-Xms64m -Xmx128m"
ENV CONFIG_PATH "/config"

ENTRYPOINT ["/entrypoint.sh"]