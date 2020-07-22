# API Test Automation framework which integrates with Docker and outputs a visual report

In this project I have automated the API's in Java using RESTAssured Library

Below are the API tests which are covered as part of this project             
Test-1: Send a get Request of an API and assert the response            
Test-2: Send a get Request of for another API and assert the response

The tech stack used for this tutorial are:

JAVA as the programming language for writing test code        
JUnit as the framework            
Maven as the build tool            
Eclipse Oxygen as the preferred IDE for writing java code.

Getting Started                

Setup your machine.
Install JDK 1.8           
Install Eclipse Oxygen
Install Maven

Cloning & Importing the Project
Clone the project from git  https://github.com/avietlobo/APITestAutomationIceye.git           
Import the project (api-test-automation) in Eclipse File -> New -> Project from Existing Sources -> Browse Project Location -> pom.xml
Now click on auto import -> Ok wait until the Eclipse downloads all the dependencies

Running tests Locally           
After cloning the project on local machine you can run the tests directly from the Eclipse, by right-clicking POM.xml and Run as Maven test.
Note:-Reports will be saved in targent/extent directory

Running tests on Docker
First you need to pull docker image from avietlobo docker repository with below steps
1) Open docker terminal
2) Fire this command docker pull avietlobo/dockerhub:apiv1.0 [This will pull the image from docker hub]
3) Fire docker ps command and note down the CONTAINER ID
4) Run the below command to run the image
docker run -it --rm avietlobo/dockerhub:api /bin/sh
5) Fire mvn test
6) Fire docker ps command to note the container ID which will be used in step 6
7) Fire below command to copy report on local machine
docker cp containerID:/target/extent/ExtentReport.html  /Users/yourusername/folder
8) The above command will copy the API test report in local machine directory (/Users/yourusername/folder)
9) Similarly the log file can be copied using command docker cp containerID:log4j-application.log  /Users/yourusername/folder



