package com.team4.deskbookingappbe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @GetMapping("/")
    public String Welcome(){
        return "plz work";
    }

}