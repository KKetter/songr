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

    @GetMapping("/hello")
    public String songrHelloWorld(){
        //add parameter for name
        return "Hello ! Welcome to songr";
    }
    // /hello should be a variable
    @GetMapping("/capitalize/{inputToCapitalize}")
    public String songrCapitalize(@PathVariable String inputToCapitalize){
        String capitalize = inputToCapitalize.toUpperCase();
        return capitalize;
    }



}
