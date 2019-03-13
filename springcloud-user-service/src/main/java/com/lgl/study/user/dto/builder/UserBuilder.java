package com.lgl.study.user.dto.builder;

import com.lgl.study.user.dao.UserDAO;
import com.lgl.study.user.dto.UserDTO;
import org.springframework.beans.BeanUtils;

public class UserBuilder {

    public static UserDTO build(UserDAO param) {
        UserDTO res = new UserDTO();
        BeanUtils.copyProperties(param, res);
        return res;
    }
}
