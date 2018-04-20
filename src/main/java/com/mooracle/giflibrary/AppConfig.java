package com.mooracle.giflibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

//2-4: adding annotation for auto configuration:
@EnableAutoConfiguration
public class AppConfig {
    /**ENTRY 2: Add Spring Config File
     *  1. This is the configuration file for the Spring App we will develop. The name AppConfig is NOT mandatory
     *      it just easy to remember.
     *  2.  Here we will declare the main method that will be run for this Spring Apps
     *  3.  Then we call a method from Spring Boot Library that will run the apps. The class is SpringApplication and
     *      the method called is run.
     *      pass the argument of the class where the main method is and the string args for the main method
     *  4.  In order to make Spring to be auto configured we'll need to add @EnableAutoConfiguration
     *      This will enable the Spring to be deployed to web server each time it runs from the plugin set in Gradle
     *  TODO: MOO: NEXT ENTRY 3: Creating Controllers and Views*/

    //2-2: declaring main method:
    public static void main(String[] args) {
        //2-3: call Spring run method:
        SpringApplication.run(AppConfig.class, args);
    }

}
