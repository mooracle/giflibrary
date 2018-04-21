package com.mooracle.giflibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//3-8: Add annotation for controller class
@Controller
public class GifController {
    //ENTRY 3: ENTRY 7
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
     *
     *  ENTRY 7: Using Thymeleaf to Serve HTML
     *  1.  Delete the @ResponseBody at listGifs() method because this annotation will make Spring use the returned
     *      String as output while here we will use Thymeleaf to render the webpage
     *  2.  Change the return with the name of the html template page we want to render (in this case "home" as to
     *      refer to: home.html)
     *  AFTER: we can save and bootRun it to see Thymeleaf in simple action!
     *  NEXT: ENTRY 8: Adding Static Assets - list pre-requisite steps
     *      1.  create new directory under resource directory name it SPECIFICALLY as static
     *      2.  inside the static directory create ne css file and name it apps.css
     *      3.  inside the static directory make new directory make a new directory name it gifimgs
     *      4. download the file compiler-bot.gif and place it inside the gifimgs directory
     *  GOTO: apps.css for ENTRY 8: Adding Static Assets
     *  */

    //3-4: build method; 3-5: 3-6: add appropriate annotations: 7-1: delete @ResponseBody
    @RequestMapping(value = "/")
    public String listGifs(){
        //7-2: return the name of the html file template:
        return "home";
    }
}
