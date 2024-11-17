# .gitpod.Dockerfile
FROM gitpod/workspace-full

# Install OpenJDK 17
RUN sudo apt-get update && \
    sudo apt-get install -y openjdk-17-jdk

# Set JAVA_HOME and update PATH
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
ENV PATH="${JAVA_HOME}/bin:${PATH}"
