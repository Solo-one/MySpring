package com.xiaoming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoming.bean.UserInfo;
import com.xiaoming.dao.UserMapper;
import com.xiaoming.service.UserService;

/**
 * @author by fangxiaoming01
 * @date 2018/2/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userDao;

    @Cacheable(value = "user", key = "'User:all'")
    @Override
    public List<UserInfo> queryUsers() {
        System.out.println("queryUsers not in redis cache");
        // PageHelper 分页
        PageHelper.startPage(1, 2, true);
        List<UserInfo> list = userDao.queryUsers();
        PageInfo pageInfo = new PageInfo(list);
        // TODO 分页详细信息
        return list;
    }

    @Cacheable(value = "user", key = "'User:'+#id")
    @Override
    public UserInfo queryUserById(String id) {
        System.out.println("queryUserById not in redis cache");
        return userDao.queryUserById(id);
    }
}
