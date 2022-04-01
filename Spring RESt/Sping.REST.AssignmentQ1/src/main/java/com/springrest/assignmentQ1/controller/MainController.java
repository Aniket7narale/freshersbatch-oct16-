package com.springrest.assignmentQ1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
    	System.out.println("This is hello Controller");
        return "Hello World!!";
    }

}

//Using @RestController 