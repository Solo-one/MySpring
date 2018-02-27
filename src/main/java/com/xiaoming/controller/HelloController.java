package com.xiaoming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author by fangxiaoming01
 * @date 2018/2/27.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/test")
    public String testindex(ModelMap map) {
        map.addAttribute("host", "Hello Xiaoming");
        return "index";
    }
}
