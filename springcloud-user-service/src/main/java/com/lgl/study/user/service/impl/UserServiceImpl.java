package com.lgl.study.user.service.impl;

import com.lgl.study.user.dto.UserDTO;
import com.lgl.study.user.dto.builder.UserBuilder;
import com.lgl.study.user.repository.UserRepository;
import com.lgl.study.user.service.UserService;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO getUserById(Long id) {
        return UserBuilder.build(userRepository.getOne(id));
    }
}
