package com.document.report.controller.admin;

import com.document.report.service.IDocumentTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminHomeController {

    @Autowired
    private IDocumentTemplateService service;

    @RequestMapping(value = {"", "/", "/index"}, method = RequestMethod.GET)
    public String index() {

        return "/admin/workbench/adminWorkbench";
    }
}
