package com.hyq.baseadmin.mapper;

import com.hyq.baseadmin.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hyq on 2021/4/13 21:42.
 */
@Mapper
public interface UserMapper {
    List<UserBean> queryUserBySchoolName(UserBean userBean);
}
