package com.lgl.study.user.controller;

import com.lgl.study.user.dto.UserDTO;
import com.lgl.study.user.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/web/api/v1/user/get/{id}", method = RequestMethod.GET)
    public UserDTO findUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
