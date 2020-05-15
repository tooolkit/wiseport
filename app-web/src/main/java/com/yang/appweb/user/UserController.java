package com.yang.appweb.user;

import com.yang.entity.user.User;
import com.yang.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list")
    public List<User> list(){
        return userService.list();
    }

    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }
}
