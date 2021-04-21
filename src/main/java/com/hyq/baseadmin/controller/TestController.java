package com.hyq.baseadmin.controller;

import com.hyq.baseadmin.bean.UserBean;
import com.hyq.baseadmin.mapper.UserMapper;
import com.hyq.baseadmin.mapper.plus.UserBeanMapper;
import com.hyq.baseadmin.service.AuthenticationService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hyq on 2021/4/8 10:26.
 */
@RestController
public class TestController {
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserBeanMapper userBeanMapper;

    @RequestMapping("/hello")
    public String index() {
//        UserBean userBeanParam = new UserBean();
////        List<UserBean> userBeanList = userMapper.queryUserBySchoolName(userBeanParam);
//        List<UserBean> userBeanList = userBeanMapper.selectList(null);
        return "Hello world";

    }
}
