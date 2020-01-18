# getting-data-from-controller
All this project does is to get data from controller and pass it to jsp page 
I have created one data class that holds person data 

Inside home() method in controller i created two objects of the class person and used map to store them.

Inside the view page i created a table with three rows one for header and the other two to hold data.

If we want to create more rows we may wanna use jsp loop 

Next project uses loop to mapp data.

<parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.2.2.RELEASE</version>
    </parent>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <java.version>1.8</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-test</artifactId>
         <scope>test</scope>
      </dependency>
        <!-- https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-jasper -->
	<dependency>
	    <groupId>org.apache.tomcat</groupId>
	    <artifactId>tomcat-jasper</artifactId>
	    <version>9.0.29</version>
	</dependency>
        
    </dependencies>
