package com.hyq.baseadmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyq on 2021/4/8 10:26.
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello world";
    }
}
