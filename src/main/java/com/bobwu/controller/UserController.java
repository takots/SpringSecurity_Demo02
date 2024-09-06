package com.bobwu.controller;

import com.bobwu.entity.User;
import com.bobwu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> list() {
        return userService.list();
    }

    // http://localhost:8888/users/search/Fiona Gallagher
    @PostMapping("/search/{name}")
    public List<User> findByName(@PathVariable("name") String name) {
        return userService.getUsersByName(name);
    }

    // http://localhost:8888/users/search/age?minAge=10&maxAge=20
    @GetMapping("/search/age")
    public List<User> searchByAge(@RequestParam("minAge") int minAge, @RequestParam("maxAge") int maxAge) {
        return userService.getUsersByAgeRange(minAge, maxAge);
    }

    // http://localhost:8888/users/search/Alice
    @GetMapping("/search/{nameLike}")
    public List<User> searchByName(@PathVariable("nameLike") String nameLike) {
        return userService.getUsersByNameLike("%" + nameLike + "%");
    }

    @PostMapping
    public boolean add(@RequestBody User user) {
        return userService.save(user);
    }
}