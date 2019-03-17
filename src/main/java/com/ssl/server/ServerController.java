package com.ssl.server;


import com.ssl.server.model.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController

public class ServerController {

    public static final String RESPONSE = "Hello Rest-User!";

    @RequestMapping(path="/foo", method= RequestMethod.GET)
    public String helloWorld() {
        System.out.println("Rocking REST!");
        return RESPONSE;
    }

    @PostMapping(path = "/foo/", produces = "application/json")
    public Greeting greeting(@RequestBody Greeting greeting) {

        return greeting;
    }

}