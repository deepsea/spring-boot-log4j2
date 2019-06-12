# README #

spring-boot-log4j2 is a repository that includes a spring boot log4j2 logging facade example

### What is this repository for? ###

* spring boot log4j2

### Who do I talk to? ###

* Rchard Lawlor - lawlorichard@gmail.com

### How do I get set up? ###

* Check out (clone) git repository 
* Install java 8
* Import as maven project into your IDE, ensure your settings.xml file is correct
* -Dspring.profiles.active=dev
* Run SpringBootLog4j2Application 

### Console results ###

[2019-06-12 17:17:43,864 DEBUG SpringBootLog4j2Application.main] Debug log message
[2019-06-12 17:17:43,868 INFO SpringBootLog4j2Application.main] Info log message
[2019-06-12 17:17:43,868 WARN SpringBootLog4j2Application.main] Warning log message
[2019-06-12 17:17:43,869 ERROR SpringBootLog4j2Application.main] Error log message
[2019-06-12 17:17:43,869 FATAL SpringBootLog4j2Application.main] Fatal log message

### File results ###

* In the log4j2.xml set your rolling file on line 23 to be
* (If you are using windows)
<RollingFile name ="File" fileName="C:${path}/${filename}.log" filePattern="C:${path}/${archive}">  
  
* (If you are using unix or linux)
<RollingFile name ="File" fileName="${sys:user.home}${path}/${filename}.log"filePattern="${sys:user.home}${path}/${archive}">

[2019-06-12 17:31:04,305 DEBUG SpringBootLog4j2Application.main] Debug log message
[2019-06-12 17:31:04,309 INFO SpringBootLog4j2Application.main] Info log message
[2019-06-12 17:31:04,309 WARN SpringBootLog4j2Application.main] Warning log message
[2019-06-12 17:31:04,309 ERROR SpringBootLog4j2Application.main] Error log message
[2019-06-12 17:31:04,310 FATAL SpringBootLog4j2Application.main] Fatal log message

You can find the log file at 

* Windows:
C:/rlawlor/dev/spring-boot/log4j2.log

* Unix/Linux:
/home/username/rlawlor/dev/spring-boot/log4j2.log

### Changing log facades ###

* In order to test the different log4j2 patterns 
* In the log4j2.xml on line 19 and 23 change the default_with_method option to default or verbose
* Now re-run your spring boot application and these patterns can be viewed and tested

### Changing log levels ###

* The log hierarchy is 
ALL < TRACE < DEBUG < INFO <WARN <ERROR <FATAL <OFF

In the log4j2.xml set your root level on line 34 to be INFO for example 
Now INFO, WARN, ERROR and FATAL are what's available



