package com.lgl.study.service.impl;

import com.lgl.study.service.MovieService;
import com.lgl.study.user.dto.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service(value = "movieService")
public class MovieServiceImpl implements MovieService {

    private final RestTemplate restTemplate;

    public MovieServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public UserDTO getUserById(Long id) {
        return restTemplate.getForObject("http://10.99.26.14:10001/web/api/v1/user/get/" + id, UserDTO.class);
    }
}
