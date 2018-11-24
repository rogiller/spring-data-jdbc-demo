package com.demo.springdatajdbcdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.IntFunction;

@RestController
public class HelloJava11Controller {

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "0") int number){

        //Java 10

        //var
        var myString = "    Hello from Java 11! ";

        IntFunction<Integer> doubleIt1 = (int x) -> x * 2;

        //Java 11
        IntFunction<Integer> doubleIt = x -> x * 2;

        return myString.stripTrailing() + " " + doubleIt.apply(number);
    }

}
