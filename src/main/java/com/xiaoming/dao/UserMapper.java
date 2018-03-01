package com.xiaoming.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xiaoming.bean.UserInfo;

/**
 * @author by fangxiaoming01
 * @date 2018/2/28.
 */
@Repository
public interface UserMapper {

    public List<UserInfo> queryUsers();

    public UserInfo queryUserById(String id);
}
