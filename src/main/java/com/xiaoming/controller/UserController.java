package com.xiaoming.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xiaoming.bean.UserInfo;
import com.xiaoming.service.UserService;

/**
 * @author by fangxiaoming01
 * @date 2018/2/28.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/findUsers")
    public List<UserInfo> queryUsers(@RequestBody String userinfo,
                                     @RequestParam(required = false) Integer page,
                                     @RequestParam(required = false) Integer row) {
        List<UserInfo> userInfos = userService.queryUsers();
        if (userInfos != null && !userInfos.isEmpty()) {
            return userInfos;
        }
        return new ArrayList<>();
    }

    @RequestMapping(value = "/findUsersJson", method = RequestMethod.POST)
    public List<UserInfo> queryUsersByJson(@RequestBody UserInfo userinfo,
                                           @RequestParam(required = false) Integer page,
                                           @RequestParam(required = false) Integer row) {
        List<UserInfo> userInfos = userService.queryUsers();
        if (userInfos != null && !userInfos.isEmpty()) {
            return userInfos;
        }
        return new ArrayList<>();
    }

    @RequestMapping("/findUserById")
    public UserInfo queryUserById(@RequestParam(required = false) String id) {
        UserInfo userInfo = userService.queryUserById(id);
        if (userInfo != null) {
            return userInfo;
        }
        return new UserInfo();
    }

}
