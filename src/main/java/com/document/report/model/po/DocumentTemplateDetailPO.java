package com.document.report.model.po;

import java.util.Date;

public class DocumentTemplateDetailPO {
    private Integer ID;

    private Integer ParentID;

    private String FileName;

    private String FilePath;

    private String Remark;

    private boolean IsDel;

    private Date CreateAt;

    private Date ModifyAt;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getParentID() {
        return ParentID;
    }

    public void setParentID(Integer parentID) {
        ParentID = parentID;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getFilePath() {
        return FilePath;
    }

    public void setFilePath(String filePath) {
        FilePath = filePath;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public boolean isDel() {
        return IsDel;
    }

    public void setDel(boolean del) {
        IsDel = del;
    }

    public Date getCreateAt() {
        return CreateAt;
    }

    public void setCreateAt(Date createAt) {
        CreateAt = createAt;
    }

    public Date getModifyAt() {
        return ModifyAt;
    }

    public void setModifyAt(Date modifyAt) {
        ModifyAt = modifyAt;
    }
}
