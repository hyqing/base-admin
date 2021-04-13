package com.hyq.baseadmin.controller;

import com.hyq.baseadmin.bean.UserBean;
import com.hyq.baseadmin.mapper.UserMapper;
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

    @RequestMapping("/hello")
    public String index() {
        UserBean userBeanParam=new UserBean();
        userBeanParam.setSchoolName("Sunny School");
        List<UserBean> userBeanList=userMapper.queryUserBySchoolName(userBeanParam);
        return "Hello world";
    }
}
