package org.jpa.jpabasicapplicaton;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {

    @Autowired
    userService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/getUsers")
    public List<User> getAllUser(){
        return userService.getUser();
    }

    @GetMapping("/getUser")
    public User getUserById(@RequestParam("userId")int userId){
        return userService.getUserById(userId);
    }


}
