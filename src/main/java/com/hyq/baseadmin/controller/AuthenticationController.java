package com.hyq.baseadmin.controller;

import com.hyq.baseadmin.bean.UserBean;
import com.hyq.baseadmin.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyq on 2021/4/21 22:14.
 */
@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody UserBean user) {

        return authenticationService.getToken(user);
    }
}
