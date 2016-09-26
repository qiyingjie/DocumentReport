package com.document.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/9/20.
 */
@Controller
@RequestMapping("/workbench")
public class WorkbenchController {

    public String getLeftNavigation() {
        return "";
    }
}
