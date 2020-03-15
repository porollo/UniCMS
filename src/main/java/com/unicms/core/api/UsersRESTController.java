package com.unicms.core.api;

import com.unicms.core.model.Article;
import com.unicms.core.model.User;
import com.unicms.core.repository.UserRepository;
import com.unicms.core.service.UserService;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")

public class UsersRESTController {

    private final UserService userService;

    public UsersRESTController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping(value = "/save")
    public @ResponseBody User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody Long id) {
        userService.delete(id);}

}