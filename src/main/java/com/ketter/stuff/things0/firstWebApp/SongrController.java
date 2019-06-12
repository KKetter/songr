package com.ketter.stuff.things0.firstWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongrController {

    @GetMapping("/")
    public String songrHello(){
        return "Hello songr!";
    }

    @GetMapping("/hello/{name}")
    public String songrPersonalHello(@PathVariable String name){
        //add parameter for name
        return "Hello, " + name + ". Welcome to songr";
    }

}
