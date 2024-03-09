package org.example.controller;

import org.example.User; // Импорт класса User
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    List<User> users = new ArrayList<>();

    @GetMapping
    public String getHome(){
        return "Hello Welcome to my world";
    }

    @GetMapping("/{name}")
    public String greetingToUser(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        users.add(user);
        return "User added";
    }
    @GetMapping("/user")
    public List<User> getAllUsers(){
        return users;
    }
}
