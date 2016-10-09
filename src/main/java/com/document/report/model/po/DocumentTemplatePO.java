package com.document.report.model.po;

import java.util.Date;

public class DocumentTemplatePO {

    private Long ID;

    private String Name;

    private String Remark;

    private Integer IsDel;

    private Date CreateAt;

    private Date ModifyAt;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public Integer getIsDel() {
        return IsDel;
    }

    public void setIsDel(Integer isDel) {
        IsDel = isDel;
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
