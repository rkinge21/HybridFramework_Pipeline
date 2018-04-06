#!/bin/bash
echo "First arg: $1"
echo "Second arg: $2"
#pwd;
#ls -lrt;
#docker-compose scale chromenode=$1 scale firefoxnode=$2
docker-compose up -d
echo "Done..."