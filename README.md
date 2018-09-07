#This project show a project developed in Java + spring boot +angularjs + oracle data base

# How to import this project to eclipse
1. Go to File
2. Click on Import
3. Look for Check out Maven Projects from SCM and click on next
4. In SCM URL box paste the url of this project which is 
5. Click on Finish
6. Don't Forget to add the OJDBC8.jar to your maven repository. Here there's a guide to do this task 
https://idevelopeveryday.blogspot.com/2018/06/v-behaviorurldefaultvmlo.html
7. If you have some problems. try to delete .m/repository directory from your device and go to Eclipse-> right click on your project-> Maven -> update project. 
This steps might fix the problem 
8. Before run this app, install an oracle data base and create an user called enterprise identified by enter2018

#Requeriments
1. Maven installed. How to install -> https://idevelopeveryday.blogspot.com/2018/06/v-behaviorurldefaultvmlo.html
2. OJDBC8 added. If you already install OJBDC just change the dependency in pom.xml
- groupId: com.oracle
- artifactId: ojdbc8
- version:12.2.0.1
3. JDK 8 installed
4. STS installed in Eclipse
5.Oracle Data Base installed
6. User in data base 
-user: enterprise
-password: enter2018

#Visit my wiki

https://github.com/EstefaniaAR/springTest/wiki

I wrote some concepts related to spring, rest  and sooner i will write some concepts about angularjs and bootstrap. All you need to build rest and responsive apps 