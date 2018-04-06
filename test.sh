#!/bin/sh
echo "$1";
echo "$2";
echo "$3";
pwd;
ls -lrt;
java -jar HybridFramework-0.0.1-SNAPSHOT-jar-with-dependencies.jar "$1" "$2" "$3";
ls -lrt;
mvn clean install;
ls -lrt;
echo "Done..."