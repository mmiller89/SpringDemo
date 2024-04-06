package com.luv2code.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${username.name}")
    private String userName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Username: " + userName + ", Team Name: " + teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }


}
