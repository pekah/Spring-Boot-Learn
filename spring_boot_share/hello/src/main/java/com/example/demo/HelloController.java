package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pekah on 2018/1/1.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }
}
