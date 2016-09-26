package com.document.report.model.po;

import java.util.Date;

public class DocumentTemplatePO {

    private Long ID;

    private Long Code;

    private String Name;

    private String Path;

    private Integer Sort;

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

    public Long getCode() {
        return Code;
    }

    public void setCode(Long code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public Integer getSort() {
        return Sort;
    }

    public void setSort(Integer sort) {
        Sort = sort;
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
