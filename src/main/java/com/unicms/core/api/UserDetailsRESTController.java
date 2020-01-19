package com.unicms.core.api;

import com.unicms.core.model.User;
import com.unicms.core.model.UserDetails;
import com.unicms.core.repository.UserDetailsRepository;
import com.unicms.core.repository.UserRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class UserDetailsRESTController {

    private final UserDetailsRepository userDetailsRepository;

    public UserDetailsRESTController(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    @GetMapping("/user-details")
    public List<UserDetails> getUsersDetails() {
        return (List<UserDetails>) userDetailsRepository.findAll();
    }

    @GetMapping("/user-details/{id}")
    public Optional<UserDetails> getUserDetails(@PathVariable Long id) {
        return userDetailsRepository.findById(id);
    }

    @PostMapping("/user-details")
    void addUserDetails(@RequestBody UserDetails userDetails) {
        userDetailsRepository.save(userDetails);
    }

    @DeleteMapping("/user-details/{id}")
    void deleteUserDetails(@RequestBody UserDetails userDetails) { userDetailsRepository.delete(userDetails);}
}