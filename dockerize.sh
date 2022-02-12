#!/bin/sh

set -ex

cp build/libs/*.jar target/app.jar

version=$(echo build/libs/*.jar | awk -F\- '{print $2}' | awk -F\.jar '{print $1}')

docker build -t pryzintul-calc-engine -f Dockerfile .

#docker build -t $IMAGE -f Dockerfile .
#
#docker tag $IMAGE $REGISTRY_URL/$IMAGE:$version

## Doing login and pushing image
#if [ -z ${REGISTRY_LOGIN_URL+x} ]
#then
#  if [-z ${AWS_SECRET_ACCESS_KEY+X} ]
#  then
#    echo "REGISTRY_LOGIN wasn't set"
#  else
#    echo "Start login with aws credentials"
#
#    # Installing aws-cli
#    apk update
#    apk add --no-cache python3 py3-pip curl
#    pip3 install --upgrade pip
#    pip3 install awscli
#    rm -rf /var/cache/apk/*
#
#    # Docker login (aws ecr get-login)
#    $(AWS_ACCESS_KEY_ID=$AWS_ACCESS_KEY_ID AWS_SECRET_ACCESS_KEY=$AWS_SECRET_ACCESS_KEY aws ecr get-login --region eu-west-1 --no-include-email)
#fi
#else echo "Login to '$REGISTRY_LOGIN_URL'"
#  docker login -u $REGISTRY_USERNAME -p $REGISTRY_PASSWORD $REGISTRY_LOGIN_URL
#fi
#docker push $REGISTRY_URL/$IMAGE:$version
