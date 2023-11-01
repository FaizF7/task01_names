package com.bnta.task01_names.controllers;

import com.bnta.task01_names.models.Celebration;
import com.bnta.task01_names.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping(value="/greeting")
public class GreetingController {

//    @GetMapping
//    public Greeting greeting(@RequestParam (defaultValue = "Faiz") String name, @RequestParam (defaultValue = "day") String timeOfDay){
//
//        return new Greeting(name, timeOfDay);
//    }

    @GetMapping(value= "/christmas")
    public Celebration festiveGreeting(){
        return new Celebration("Merry Christmas");
    }

}
