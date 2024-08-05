package edu.icet.crm.controller;

import edu.icet.crm.model.User;
import edu.icet.crm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    @PostMapping("/auth/login")
    public boolean login(@RequestBody User user){
        return userService.login(user);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return userService.register(user);
    }
}
