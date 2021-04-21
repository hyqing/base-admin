package com.hyq.baseadmin.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.hyq.baseadmin.bean.UserBean;
import org.springframework.stereotype.Service;

/**
 * Created by hyq on 2021/4/21 21:51.
 */
@Service
public class AuthenticationService {

    public String getToken(UserBean user) {
        String token = "";
        token = JWT.create().withAudience(user.getAccount())
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}
