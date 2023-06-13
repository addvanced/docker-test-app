# syntax=docker/dockerfile:experimental
FROM eclipse-temurin:17-jdk-jammy
LABEL maintainer="ADDVANCED <kenneth@addvanced.dk>"

WORKDIR /workspace/app
COPY app .
RUN ls

#RUN mkdir gradle && mv wrapper gradle
#RUN mkdir src && mv main src && mv test src

#RUN ls
#RUN ls gradle
#RUN ls src

#RUN --mount=type=cache,target=/root/.gradle ./gradlew clean build
#RUN mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)

#RUN addgroup --system --gid 1000 addvanced && adduser --system --shell /usr/sbin/nologin --uid 1000 --ingroup addvanced addvanced
#USER addvanced

#RUN --mount=type=cache,target=/root/.gradle ./gradlew clean build
#RUN mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)

#VOLUME /tmp

#ARG DEPENDENCY=/workspace/app/build/dependency
#COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
#COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
#ENTRYPOINT ["java","-cp","app:app/lib/*","DockerBuildTestApplication.Application"]