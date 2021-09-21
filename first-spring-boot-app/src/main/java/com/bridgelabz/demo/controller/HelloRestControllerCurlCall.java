package com.bridgelabz.demo.controller;

import com.bridgelabz.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class HelloRestControllerCurlCall {

    /**
     * Get--localhost:8080/demo
     * @return-Hello From BridgeLabz !!
     */
    @RequestMapping(value = {"","/","/test1"})
    public String sayHello(){
        return "Hello From BridgeLabz !!";
    }

    /**
     * Get--localhost:8080/demo/query?name=bhupendra
     * @param name
     * @return-Hello bhupendra !
     */
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello "+name+ "!";
    }

    /**
     * Get--localhost:8080/demo/param/bhupendra
     * @param name
     * @return--Hello bhupendra !
     */
    @GetMapping("/param/{name}")
        public String sayHelloParameter(@PathVariable String name){
        return "Hello " + name + "!";
    }

    /**
     * Post--localhost:8080/demo/post
     * {
     *      "firstName":"Bhupendra",
     *     "lastName":"Wadekar"
     * }
     * @param user
     * @return--HelloBhupendra Wadekar!
     */

    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return  "Hello" + user.getFirstName()+" "+ user.getLastName()+ "!";
    }


    /**
     * Put?update--localhost:8080/demo/put/Bhupendra/?lastName=Don
     * @param firstName
     * @param lastName
     * @return--Hello Bhupendra Don !
     */
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName){
        return  "Hello "+firstName+" "+lastName+" !";
    }
}
