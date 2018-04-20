package com.mooracle.giflibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//3-8: Add annotation for controller class
@Controller
public class GifController {
    //ENTRY 3:
    /** ENTRY 3: Create a Controllers to Handle HTTP Requests
     *  1.  In Spring the controller is a Java Object whose job is to handle requests to certain URI (Uniform Resource
     *      Identifier) which is different from URL.
     *  2.  since our application will be coded without regard to the host name and without indicating protocol, we'll
     *      continue using URI
     *  3.  In a Spring controller you can add as many method as you like, though in general they should be related to
     *      the object of the controller refers to, in this case a gif. This controller is used to handle requests to
     *      any page of our apps (in this case page that shows all gif pics or just a single gif pic
     *  4.  Now we add method public String listGifs, naming is optional.
     *  5.  Add @RequestMapping to refer to main page or "/" in the value
     *  6.  Add @ResponseBody to pair with sending back response after request and process
     *  7.  add return "List of all GIFs" for now since it was still trial and we must return a String
     *  8.  add @Controller on the class to let Spring framework scanner sees this class as Controller
     *      NEXT: ENTRY 4: Create a Controller to Handle HTTP requests
     *          1.  We need to ADD @ComponenetScan in the AppConfig.java to make Spring framework scan for @Controller
     *              that this GifController class has.
     *      GOTO: AppConfig.java for ENTRY 4!
     *  */

    //3-4: build method; 3-5: 3-6: add appropriate annotations:
    @RequestMapping(value = "/")
    @ResponseBody
    public String listGifs(){
        return "This is the list of all Gif";
    }
}