FROM java:8
ENV WORK_PATH /home/project/dockerdemo
ENV APP_NAME @project.build.finalName@.@project.packaging@
ENV APP_VERSION @project.version@

VOLUME ["/home/project", "/tmp/data"]
COPY $APP_NAME $WORK_PATH/
WORKDIR $WORK_PATH
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom"]
CMD ["-jar", "@project.build.finalName@.@project.packaging@"]