package com.devops.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsDemoController {

    @GetMapping(value = "/sayHi/{name}")
    public String sayHi(@PathVariable(name = "name") String name) {
        return String.format("hello! %s !", name);
    }
}
