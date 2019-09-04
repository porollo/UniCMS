package com.unicms.core.api;

import com.unicms.core.model.User;
import com.unicms.core.repository.UserRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class UsersRESTController {

    private final UserRepository userRepository;

    public UsersRESTController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
    void deleteUser(@RequestBody User user) { userRepository.delete(user);}
}