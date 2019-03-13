package com.lgl.study.movie.client;

import com.lgl.study.movie.client.fallback.FeignUserClientFallback;
import com.lgl.study.movie.config.FeignSecurityConfiguration;
import com.lgl.study.user.dto.UserDTO;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "user-api", fallback = FeignUserClientFallback.class, configuration = FeignSecurityConfiguration.class)
public interface FeignUserClient {

    @RequestMapping(value = "/web/api/v1/user/get/{id}", method = RequestMethod.GET)
    UserDTO findUserById(@PathVariable("id") Long id);
}
