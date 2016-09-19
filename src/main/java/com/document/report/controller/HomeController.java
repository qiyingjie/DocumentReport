package com.document.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/9/18.
 */
@Controller
@RequestMapping(value = {"", "/"})
public class HomeController {

    @RequestMapping(value = {"", "index"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String signIn(String userid, String pwd, String code) {
        // 登录验证

        return "";
    }
}
