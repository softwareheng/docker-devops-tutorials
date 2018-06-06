FROM java:8
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
CMD ["java", "-version"]
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","docker-devops-tutorials-3.0.0-SNAPSHOT.jar"]