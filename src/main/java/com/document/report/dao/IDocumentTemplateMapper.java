package com.document.report.dao;

import com.document.report.model.DocumentTemplateVO;
import com.document.report.model.po.DocumentTemplatePO;

import java.util.List;

/**
 * Created by Administrator on 2016/9/26.
 */
public interface IDocumentTemplateMapper {

    List<DocumentTemplatePO> select(DocumentTemplateVO prams);

    int selectCount(DocumentTemplateVO prams);

    int insert(DocumentTemplateVO params);
}
