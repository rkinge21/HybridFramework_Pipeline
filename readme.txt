Functionality in Hybrid Framework: 


Maven project. We will not download individual jars as we did earlier, rather we will add dependencies in our pom.xml file.
And of course, it will a Selenium, TestNG project.
We will include like Page Object Modeling, Page Factory concepts in our framework.
We will add Data Driven technique in our framework for test data input.
The framework will have Log4j logging.
In addition to TestNG reports, we will also include Extent Reports for advanced HTML reports.
We will create user defined methods for different actions.
And we will also add a new topic in our Hybrid Framework and that is the use of properties file in order to store some configurable parameters of our application.


What is the difference between “-Dmaven.test.skip.exec” vs “-Dmaven.test.skip=true”?

"maven.test.skip.exec=true" the tests get compiled, but not executed.
"maven.test.skip=true" doesn't compile or execute the tests.


TO Create FAT Jar

mvn clean package

https://www.mkyong.com/maven/create-a-fat-jar-file-maven-assembly-plugin/
http://www.mkyong.com/maven/create-a-fat-jar-file-maven-shade-plugin/
http://www.mkyong.com/maven/maven-create-a-fat-jar-file-one-jar-example/



mvn clean package -Dremotewebdriver="ilde17085.eaas.amdocs.com:4448"

mvn clean package -DthreadPoolSize="3" -Dremotewebdriver="0.0.0.0:4448"

java -jar HybridFramework-0.0.1-SNAPSHOT-jar-with-dependencies.jar ilde17085.eaas.amdocs.com:4448

https://docs.docker.com/engine/reference/builder/#arg

docker build -t mydocker_1 --build-arg HostDetails=ilde17085.eaas.amdocs.com:4448 .
docker run  mydocker_1 ilde17085.eaas.amdocs.com:4448


docker stop $(docker ps -aq); docker rm $(docker ps -aq)
docker rmi $(docker images -q)


sudo systemctl stop kubelet
docker kill -f $(docker ps -aq) ;  docker rm -f $(docker ps -aq)
docker images
docker rmi -f b00ea124ed62 529165268aa2 0c45f7936948 
docker images


docker run -d -p 4448:4444 --name selenium-hub selenium/hub:3.11.0-californium
docker run -d -P --link selenium-hub:hub -v /dev/shm:/dev/shm selenium/node-chrome-debug:3.11.0-californium
docker run -d -P --link selenium-hub:hub -v /dev/shm:/dev/shm selenium/node-firefox-debug:3.11.0-californium


docker pull selenium/hub
docker run -d --name selenium-hub selenium/hub
docker run -d -p 4444:4444 --name selenium-hub -v /dev/shm:/dev/shm selenium/hub

