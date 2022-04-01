package com.springrest.assignmentQ2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.assignmentQ2.entities.User;

@RestController
public class MainController {
	
    User user = new User("Aniket Narale", "Asn@1234");

    @PostMapping(path="/login")
    @ResponseBody
    public String login(@RequestBody User user) {

        System.out.println(user);
        if (this.user.getUsername().equals(user.getUsername()) && this.user.getPassword().equals(user.getPassword())) {
            return "Valid User";
        }
        return "Invalid User";
    }

}
