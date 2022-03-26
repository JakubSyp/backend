package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/example")
    public String Source() {
        return "Source";
    }
    @RequestMapping("/test/{name}")
    @ResponseBody
    public String tset() {
        return "Hello World";
    }

    @RequestMapping("/third")
    public String third() {
        return "1";
    }

}