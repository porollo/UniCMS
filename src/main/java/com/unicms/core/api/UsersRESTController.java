package com.unicms.core.api;

import com.unicms.core.model.User;
import com.unicms.core.model.Video;
import com.unicms.core.repository.UserRepository;
import com.unicms.core.repository.VideoRepository;
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
    } // Pass

    @GetMapping("/users/{id}")
    public Optional<User> getUsers(@PathVariable Long id) {
        return userRepository.findById(id);
    } //Pass

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @DeleteMapping("/users")
    public void deleteUser(@RequestBody User user) {
        userRepository.delete(user);}
}