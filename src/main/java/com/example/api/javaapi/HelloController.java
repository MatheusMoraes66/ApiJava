package com.example.api.javaapi;

import jdk.jfr.Frequency;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class HelloController {

    @RequestMapping (method = RequestMethod.GET, path = "/hello")
    public String helloWorld() {
        return "Hello";
    }

    @RequestMapping (method = RequestMethod.GET, path = "/hello/{name}")
    public String helloToYou(@PathVariable String name) {
        return String.format("Hello %s", name);
    }

    @RequestMapping (method = RequestMethod.GET, path = "/message")
    public  String helloForUs(@PathParam("message") String message, @PathParam("name") String name){
        return new Hello(message,name).toString();
    }
}
