#!/bin/bash

REPOSITORY=/home/ec2-user/app/shms_project_step2
PROJECT_NAME=shms_test

echo "> Build 파일 복사"

cp $REPOSITORY/zip/*.jar $REPOSITORY/

ehco "> 현재 구동 중인 애플리케이션 pid 확인"

CURRENT_PID=$(pgrep -f shms-0.0.1-SNAPSHOT.jar | awk '{print $1}')

echo "현재 구동 중인 애플리케이션 pid: $CURRENT_PID"

if [ -z "$CURRENT_PID" ]; then
	echo "> 현재 구동 중인 애플리케이션이 없으므로 종료하지 않습니다._step2"
else
	echo "> kill -15 $CURRENT_PID"
	kill -15 $CURRENT_PID
	sleep 5
fi

echo ">새 애플리케이션 배포"

JAR_NAME=$(ls -tr $REPOSITORY/*.jar | tail -n 1)

echo "> JAR Name: $JAR_NAME"

echo "> $JAR_NAME에 실행권한 추가"

chmod +x $JAR_NAME

echo "> $JAR_NAME 실행"

nohup java -jar $JAR_NAME &
