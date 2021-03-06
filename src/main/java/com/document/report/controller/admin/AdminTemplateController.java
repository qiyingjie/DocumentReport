package com.document.report.controller.admin;

import com.document.report.controller.WebBaseController;
import com.document.report.model.DocumentTemplateVO;
import com.document.report.model.ResultVO;
import com.document.report.model.po.DocumentTemplatePO;
import com.document.report.service.IDocumentTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin/template")
public class AdminTemplateController extends WebBaseController {

    @Autowired
    private IDocumentTemplateService documentTemplateService;

    @RequestMapping(value = {"", "/"})
    public String index() {
        return "/admin/template";
    }

    @ResponseBody
    @RequestMapping("/get")
    public ResultVO<DocumentTemplatePO> get(DocumentTemplateVO params) {
        ResultVO<DocumentTemplatePO> result =  new ResultVO<DocumentTemplatePO>();
        result.setSuccess(false);

        try {
            if (params != null && params.getPageIndex() > 0 && params.getPageSize() > 0) {
                List<DocumentTemplatePO> poList = documentTemplateService.get(params);
                if (poList != null && poList.size() > 0) {
                    result.setTotal(documentTemplateService.getTotal(params));
                    result.setRows(poList);
                    result.setSuccess(true);
                }
            }
        }
        catch (Exception e) {
            // TODO: add log
        }

        return result;
    }
}
