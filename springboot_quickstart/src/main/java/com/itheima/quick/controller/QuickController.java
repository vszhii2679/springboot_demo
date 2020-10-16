package com.itheima.quick.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quick")
public class QuickController {

    @Value("${person.name}")
    private String name;

    @Autowired
    private Environment env;

    @GetMapping("/index/{index}")
    public String getIndex(@PathVariable("index") int index) {
        System.out.println("index = " + index);
        System.out.println("name = " + name);
        return "get index is on service !";
    }

    @GetMapping("/getByEnv")
    public String getByEnv() {
        System.out.println("name = " + env.getProperty("person.name"));
        System.out.println("age = " + env.getProperty("person.age"));
        System.out.println("address = " + env.getProperty("person.address[0]"));
        System.out.println("address = " + env.getProperty("person.address[1]"));
        System.out.println("address = " + env.getProperty("person.address[2]"));
        return "getByEnv is on service !";
    }
}
