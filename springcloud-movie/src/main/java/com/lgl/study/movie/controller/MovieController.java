package com.lgl.study.movie.controller;

import com.lgl.study.movie.client.FeignUserClient;
import com.lgl.study.service.MovieService;
import com.lgl.study.user.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class MovieController {

    private final MovieService movieService;

    private final DiscoveryClient discoveryClient;

    private final LoadBalancerClient loadBalancerClient;

    private final FeignUserClient feignUserClient;

    public MovieController(MovieService movieService, DiscoveryClient discoveryClient, LoadBalancerClient loadBalancerClient, FeignUserClient feignUserClient) {
        this.movieService = movieService;
        this.discoveryClient = discoveryClient;
        this.loadBalancerClient = loadBalancerClient;
        this.feignUserClient = feignUserClient;
    }

    /**
     * Call API by REST Template
     * @param id user id
     * @return {@link UserDTO}
     */
    @GetMapping(value = "/web/api/v1/user/get/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return movieService.getUserById(id);
    }

    /**
     * Call API by Feign client
     * @param id user id
     * @return {@link UserDTO}
     */
    @RequestMapping(value = "/web/api/v2/user/get/{id}", method = RequestMethod.GET)
    public UserDTO findUserById(@PathVariable("id") Long id) {
        return feignUserClient.findUserById(id);
    }

    /**
     * Query user-api service information
     */
    @GetMapping("/user-instance")
    public List<ServiceInstance> getServiceInfo() {
        return this.discoveryClient.getInstances("user-api");
    }

    /**
     * The information of which provider choose by Ribbon
     */
    @GetMapping(value = "/lb-instance")
    public void lbInstanceInfo() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("user-api");
        log.info("Instance info:===>{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());

    }
}
