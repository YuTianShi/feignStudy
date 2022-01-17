package com.sty.serviceB.controller;

import com.sty.serviceB.client.ServiceAClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * ConfigController.
 *
 * @author shitianyu 2022-01-14 11:21
 */
@RestController
@RequestMapping("/config")
//@RefreshScope
public class ConfigController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @Resource
    private ServiceAClient serviceAClient;


    private final RestTemplate restTemplate;
    @Autowired
    public ConfigController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}
    /**
     * http://localhost:8080/config/get
     */
    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }

    @RequestMapping("/getMsg")
    public String getMsg() {
        return restTemplate.getForObject("http://serviceA/getMsg?msg=" + "123", String.class);
    }

}
