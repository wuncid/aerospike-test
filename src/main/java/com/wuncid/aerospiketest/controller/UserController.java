package com.wuncid.aerospiketest.controller;

import com.wuncid.aerospiketest.model.User;
import com.wuncid.aerospiketest.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable("id") Integer id) {
        return userService.findUserById(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Integer id) {
        userService.removeUserById(id);
    }
}
