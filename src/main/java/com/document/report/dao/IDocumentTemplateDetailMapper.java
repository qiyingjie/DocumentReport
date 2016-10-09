package com.document.report.dao;

import com.document.report.model.po.DocumentTemplateDetailPO;

import java.util.List;

public interface IDocumentTemplateDetailMapper {

    List<DocumentTemplateDetailPO> select(DocumentTemplateDetailPO params);

    int insert(DocumentTemplateDetailPO params);

    int update(DocumentTemplateDetailPO params);
}
