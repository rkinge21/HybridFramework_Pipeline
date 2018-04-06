FROM java:8
ARG HostDetails
COPY RunOnDocker.sh /
RUN ["chmod", "+x", "RunOnDocker.sh"]

ADD /target/HybridFramework-0.0.1-SNAPSHOT-jar-with-dependencies.jar //
ADD /target/HybridFramework-0.0.1-SNAPSHOT.jar //

ENTRYPOINT ["/RunOnDocker.sh", "$HostDetails"]