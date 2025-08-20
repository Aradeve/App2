FROM mcr.microsoft.com/vscode/devcontainers/java:11
USER root
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get -y install --no-install-recommends wget unzip
ARG ANDROID_SDK_ROOT=/opt/android/sdk
ENV ANDROID_SDK_ROOT=${ANDROID_SDK_ROOT}
ENV PATH=$PATH:${ANDROID_SDK_ROOT}/cmdline-tools/latest/bin:${ANDROID_SDK_ROOT}/platform-tools
RUN mkdir -p ${ANDROID_SDK_ROOT}/cmdline-tools \
    && wget -O /tmp/sdk.zip "https://dl.google.com/android/repository/commandlinetools-linux-8512546_latest.zip" \
    && unzip /tmp/sdk.zip -d ${ANDROID_SDK_ROOT}/cmdline-tools \
    && mv ${ANDROID_SDK_ROOT}/cmdline-tools/cmdline-tools ${ANDROID_SDK_ROOT}/cmdline-tools/latest \
    && rm /tmp/sdk.zip \
    && yes | sdkmanager --licenses && sdkmanager "platform-tools" "platforms;android-31" "build-tools;31.0.0"
USER vscode
