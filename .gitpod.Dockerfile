FROM gitpod/workspace-full:latest

# Install OpenJDK 21
RUN sudo apt-get update \
    && sudo apt-get install -y openjdk-21-jdk \
    && sudo apt-get clean
