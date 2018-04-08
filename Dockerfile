FROM java:8
ARG HostDetails
COPY RunOnDocker.sh /
COPY pom.xml /
RUN ["chmod", "+x", "RunOnDocker.sh"]

COPY src /src
COPY drivers /drivers
COPY resources /resources

ADD /target/HybridFramework-0.0.1-SNAPSHOT-jar-with-dependencies.jar //
ADD /target/HybridFramework-0.0.1-SNAPSHOT.jar //

ENTRYPOINT ["/RunOnDocker.sh", "$HostDetails"]