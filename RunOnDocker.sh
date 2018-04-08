#!/bin/sh
echo "First argument: $1";
echo "Second argument: $2";
echo "Third argument: $3";
pwd;
ls -lrt;
#jar -xvf /HybridFramework-0.0.1-SNAPSHOT-jar-with-dependencies.jar;
#ls -lrt;
java -jar /HybridFramework-0.0.1-SNAPSHOT-jar-with-dependencies.jar "$2";
ls -lrt;
echo "Done..."