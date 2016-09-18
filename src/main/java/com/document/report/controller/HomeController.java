package com.document.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
