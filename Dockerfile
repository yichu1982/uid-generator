FROM reg.changhong.io/basic_images/openjdk11:jdk-11.0.1.13-alpine
ADD uid-generator-api/target/uid-generator-api.jar /uid-generator-api.jar

ENV TZ=Asia/Shanghai
EXPOSE 8080

ENV JAVA_OPTS="-server -Xmx2g -Xms2g -Dfile.encoding=UTF8  -Duser.timezone=GMT+08"
#ENV ENV="DEV -Ddev_meta=http://10.3.30.15:8080"
#CMD exec java ${JAVA_OPTS} -Denv=${ENV} -jar /uid-generator-api.jar
CMD exec java ${JAVA_OPTS} -jar /uid-generator-api.jar