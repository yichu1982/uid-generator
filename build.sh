#!/bin/sh
if [ -z "${JAVA_OPTS}" ]
then
	JAVA_OPTS="-Xmx1024M -Xms1024M -Xmn375M -XX:+PrintFlagsFinal -XX:+PrintGCDetails -Dfile.encoding=UTF8 -Duser.timezone=GMT+08"
fi
java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /uid-generator-api.jar