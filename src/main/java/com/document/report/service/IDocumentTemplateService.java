package com.document.report.service;

import com.document.report.model.DocumentTemplateVO;
import com.document.report.model.po.DocumentTemplatePO;

import java.util.List;

public interface IDocumentTemplateService {

    List<DocumentTemplatePO> get(DocumentTemplateVO params);

    int getTotal(DocumentTemplateVO params);
}
