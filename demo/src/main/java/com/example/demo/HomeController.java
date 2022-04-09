package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HomeController {

    @Autowired
    public UsersService usersService;

    //http://localhost:8080/api/users?page-number=1&page-size=20
    @RequestMapping("/api/users")
    @ResponseBody
    public UsersPage users(
        @RequestParam(name = "page-number", defaultValue = "1") Integer pageNumber,
        @RequestParam(name = "page-size", defaultValue = "20") Integer pageSize

    ){

        return this.usersService.getUsers(pageNumber, pageSize);
    }


}