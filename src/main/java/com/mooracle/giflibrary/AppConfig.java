package com.mooracle.giflibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//2-4: adding annotation for auto configuration; 4-1: add annotation for scanning
@EnableAutoConfiguration
@ComponentScan
public class AppConfig {
    //ENTRY 2
    /**ENTRY 2: Add Spring Config File
     *  1. This is the configuration file for the Spring App we will develop. The name AppConfig is NOT mandatory
     *      it just easy to remember.
     *  2.  Here we will declare the main method that will be run for this Spring Apps
     *  3.  Then we call a method from Spring Boot Library that will run the apps. The class is SpringApplication and
     *      the method called is run.
     *      pass the argument of the class where the main method is and the string args for the main method
     *  4.  In order to make Spring to be auto configured we'll need to add @EnableAutoConfiguration
     *      This will enable the Spring to be deployed to web server each time it runs from the plugin set in Gradle
     *  NEXT ENTRY 3: Create a Controllers to Handle HTTP Requests
     *  before we go to ENTRY 3 we need to set controller package:
     *      1.  create new package at com.mooracle.giflibrary and named it controller
     *      2.  inside the controller package make new java class called GifController
     *  GOTO: GifController for ENTRY 3
     *
     * ENTRY 4: Create a Controller to Handle HTTP requests (From GifController.java)
     *  1.  we need to add @ComponentScan to instruct Spring framework to scan for @Controller
     *  AFTER: we can save and run from the Spark plugin (see ENTRY 1)
     *  TODO: NEXT: ENTRY 5: Using Thymeleaf to Serve HTML
     *      1.  we need to go to build.gradle to add dependencies and libraries of Thymeleaf
     *  GOTO: build.gradle for ENTRY 5
     *  */

    //2-2: declaring main method:
    public static void main(String[] args) {
        //2-3: call Spring run method:
        SpringApplication.run(AppConfig.class, args);
    }

}
