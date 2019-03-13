package com.lgl.study.movie.client.fallback;

import com.lgl.study.movie.client.FeignUserClient;
import com.lgl.study.user.dto.UserDTO;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class FeignUserClientFallback implements FeignUserClient {

    @Override
    public UserDTO findUserById(Long id) {
        UserDTO res = new UserDTO();
        res.setAge(0);
        res.setBalance(new BigDecimal("0"));
        res.setId(0L);
        res.setName("default");
        res.setUsername("null");
        return res;
    }
}
