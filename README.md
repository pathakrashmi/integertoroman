# integertoroman

This RESTful web service allows one to convert integer number to its equivalent Roman numeral. The integer value should be any number between 1 to 3999. This application has static home page that will accept HTTP GET request with query parameter as shown below:

http://localhost:8080/romannumeral?query={integer}

Roman Numeral Reference 
•	https://www.rapidtables.com/convert/number/roman-numerals-converter.html
•	http://www.novaroma.org/via_romana/numbers.html
•	https://en.wikipedia.org/wiki/Roman_numerals

Build and Run:
-	Clone this repo and open it in editor.
-	Clean and Build project (Mvn clean build)
-	Run IntegertoromanApplication.java as Java application
-	Open chrome browser and enter the following url: http://localhost:8080/romannumeral?query={integer} 

Dependencies
-	Maven: maven-4.0.0
-	JVM: 11.0.2 
-	Spring Framework: Spring boot actuator, Spring boot web, Spring boot test

Packaging layout:
This java service is serving a web site with Spring MVC. The java services are in src/main/java/. 
RomanNumber.java: This class is responsible for converting integers to Roman numerals. 

RomanNumberController: This controller is responsible for HTTP request mapping. It also implements Error controller.

IntegertoromanApplicationTests: This class contains integration tests for this application. It tests the http responses.

Pom.xml: This xml file contains information of all the maven, spring configurations and dependencies. When the project is built, basically pom file get reads and all the dependent files (jars) are downloaded.

Using Spring Boot Accurator for enabling devops capabilities for this project. This utility allows one to monitor and manage web applications. Application health monitoring, auditing, and metrics gathering can be done easily. The configuration file can be found at src/main/resources/application.properties where one can enable/disable various Accurator endpoints as per one's requirements.

Following are some important accurator endpoints are available for this application among others.

Health (http://localhost:8080/actuator/health)
Metrics (http://localhost:8080/actuator/metrics)
Mapping (http://localhost:8080/actuator/mapping)
Loggers (http://localhost:8080/actuator/loggers)
Caches (http://localhost:8080/actuator/caches)
Info (http://localhost:8080/actuator/info)

One can also use Postman to monitor the API and its performance. Postman monitors can be used to schedule a collection which monitors the performance and responses of web APIs. The results of these scheduled searches can be used to send alerts or messages to the team. One major drawback of postman monitor is that it only allows to monitor 1000 APIs. But for this particular project (integertoroman) postman would be a decent fit.
