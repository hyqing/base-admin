package com.hyq.baseadmin.controller;

import com.hyq.baseadmin.bean.UserBean;
import com.hyq.baseadmin.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by hyq on 2021/4/21 22:14.
 */
@Controller
@RequestMapping("/auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "/getToken", method = RequestMethod.POST)
    @ResponseBody
    public String getToken(@RequestBody UserBean user) {

        return authenticationService.getToken(user);
    }

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        return "redirect:http://localhost:3000";
//        return "redirect:http://baidu.com";
    }
}
