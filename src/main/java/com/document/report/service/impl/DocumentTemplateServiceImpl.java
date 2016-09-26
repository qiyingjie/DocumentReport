package com.document.report.service.impl;

import com.document.report.dao.IDocumentTemplateMapper;
import com.document.report.model.po.DocumentTemplatePO;
import com.document.report.service.IDocumentTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DocumentTemplateServiceImpl implements IDocumentTemplateService {

    @Autowired
    private IDocumentTemplateMapper documentTemplateMapper;

    @Override
    public List<DocumentTemplatePO> get() {
        return documentTemplateMapper.get();
    }
}
