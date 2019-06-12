package com.ketter.stuff.things0.firstWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/capitalize/{inputToCapitalize}")
    public String songrCapitalize(@PathVariable String inputToCapitalize){
        String capitalize = inputToCapitalize.toUpperCase();
        return capitalize;
    }

    @GetMapping("/reverse")
    public String songrReverse(@RequestParam String inputToReverse){
        //Array to store sentence
        String[] temp = inputToReverse.split(" ");
        //temp variable to assign reordered string
        String reversed = "";
        for(int i = 0; i < temp.length; i++) {
                    if (i == temp.length - 1) reversed = temp[i] + reversed;
                    else {
                        reversed = " " + temp[i] + reversed;
                    }
                }
        System.out.println("Before:" + inputToReverse);
        System.out.println("After:" + reversed);
        return reversed;
    }
}
