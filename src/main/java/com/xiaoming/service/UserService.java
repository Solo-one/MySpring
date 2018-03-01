package com.xiaoming.service;

import java.util.List;

import com.xiaoming.bean.UserInfo;

/**
 * @author by fangxiaoming01
 * @date 2018/2/28.
 */
public interface UserService {

    public List<UserInfo> queryUsers();

    public UserInfo queryUserById(String id);

}
