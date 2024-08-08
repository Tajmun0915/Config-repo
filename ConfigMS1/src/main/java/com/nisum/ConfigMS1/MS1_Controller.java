package com.nisum.ConfigMS1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MS1_Controller {

    @Value("${server.port}")
    private String port;

    @Value("${username}")
    private String username;

    @GetMapping("/configMS1/port")
    public String test() {
        return port;
    }

    @GetMapping("/configMS1/name")
    public String nametest() {
        return username;
    }
}
