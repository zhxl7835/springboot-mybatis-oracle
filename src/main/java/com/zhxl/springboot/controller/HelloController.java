package com.zhxl.springboot.controller;

import com.zhxl.springboot.entity.User;
import com.zhxl.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/zhxl")
    public String users0(){

        return "index";
    }

    @RequestMapping("/findAll")
    public String users1(Model model) throws Exception{
        List<User> users = userService.findAll();
        System.out.println(users);
        model.addAttribute("success", users);
        return "success";
    }

    @RequestMapping("/getUserByUsername")
    public String users2(String username) throws Exception{
        User user = userService.getUserByUsername("zhxl");
        System.out.println(user.toString());
        return "success";
    }

    @RequestMapping("/insertUser")
    public String users3(User user) throws Exception{
        user.setPassword("1221654842");
        user.setUsername("zhxl");
        userService.insertUser(user);
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/updateUser")
    public String users4(User user) throws Exception{
        user.setPassword("123456");
        user.setUsername("zhxl");
        userService.updateUser(user);
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/deleteUser")
    public String users5(User user) throws Exception{
        user.setPassword("123456");
        user.setUsername("cyd");
        userService.deleteUser(user);
        System.out.println(user);
        return "success";
    }

}
