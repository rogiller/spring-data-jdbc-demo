package com.demo.springdatajdbcdemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DataController {

    @Autowired
    ResourceRepo resourceRepo;

    @GetMapping("/data")
    Iterable<Resource> data(){


        return resourceRepo.findLimited()

    }
}
