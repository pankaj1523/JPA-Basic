package org.jpa.jpabasicapplicaton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    @Autowired
    userRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User Added";
    }

    public List<User> getUser() {
        return userRepository.findAll();
    }

    public User getUserById(int userId) {
        return userRepository.findById(userId).get();
    }


}
