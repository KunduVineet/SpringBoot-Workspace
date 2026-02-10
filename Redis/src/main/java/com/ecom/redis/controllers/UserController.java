package com.ecom.redis.controllers;

import com.ecom.redis.daos.UserDao;
import com.ecom.redis.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserDao userDao;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        user.setUserId(Integer.parseInt(UUID.randomUUID().toString()));
        return userDao.save(user);
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId){
        return userDao.get(userId);
    }

    @GetMapping("/all")
    public Map<Object, Object> getAllUsers(){
        return userDao.findAll();
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(String userId){
        userDao.delete(userId);
    }
}
