package com.company;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/string/{takenString}")
    public String printString(@PathVariable String takenString){
        return "Your String: "+takenString;
    }

}
