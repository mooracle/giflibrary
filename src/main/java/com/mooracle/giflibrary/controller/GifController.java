package com.mooracle.giflibrary.controller;

import com.mooracle.giflibrary.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

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
     *
     *  ENTRY 11: Feeding Data to Our Thymeleaf Templates
     *      1.  We implement POJO in this project so that it does not bound to the framework and can be used over and
     *          over again across any platform. Moreover, POJO is just like a mold that can be replicated or used over
     *          and over again for infinite number of object it intended to represent (in this case a gif image)
     *      2.  However, in order to incorporate the POJO to a web page we need to include it into our Controller, so
     *          that when a specific request being handled by certain Controller method it will also include the POJO
     *      3.  IMPORTANT: POJO in this case only served as representation of the actual GIF image. The real GIF image
     *          is stored in different location but the POJO has a mechanism to refer or call that specific GIF image
     *          in this case using its name field variable that will be demonstrated in ENTRY 12
     *      4.  To incorporate a POJO into a Controller first we will make a new Controller to handle request to new
     *          example URI : '/gif-details' . We will name it gifDetails method.
     *          NOTE: this is different approach to the course since I want to experiment with custom URI naming please
     *              remember to ensure all links are properly made!
     *      5.  Pay attention that it has ModelMap as argument to pass. modelMap is an object that in the Spring frame
     *          work thus does not need new instantiation
     *      6.  We need to instantiate new Gif class object and name it gif and add all of its required arguments field
     *          NOTE: this is our POJO being instantiated right here! Alsp we use LocalDate.of method to define the date
     *      7.  Next we need to include the POJO into our modelMap so that it can be render inside the HTML template
     *          file called in the end of this method
     *      8.  Finally, we return a String refering to the HTML template file in this case gif-details.html
     *  NEXT: ENTRY 12: Feeding Data to Our Thymeleaf Templates
     *      1.  we need to modify the HTML template to accept the POJO and enable it to select intended gif image not
     *          just the default compiler-bot.gif
     *  GOTO: gif-details.html for ENTRY 12: Feeding Data to Our Thymeleaf Templates*/

    //3-4: build method; 3-5: 3-6: add appropriate annotations: 7-1: delete @ResponseBody
    @RequestMapping(value = "/")
    public String listGifs(){
        //7-2: return the name of the html file template:
        return "home";
    }

    //11-4: Creating the method with @RequestMapping
    @RequestMapping(value = "/gif-details")
    public String gifDetails(ModelMap modelMap){

        //11-6: Instantiate new Gif object:
        Gif gif = new Gif("book-dominos", LocalDate.of(2018,4,20),
                "moo", true);

        //11-7: put the POJO into modelMap
        modelMap.put("gif", gif);

        //11-8: return the html template name
        return "gif-details";
    }
}
