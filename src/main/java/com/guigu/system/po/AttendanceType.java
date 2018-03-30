package com.guigu.system.po;

public class AttendanceType {
    private Integer typeId;

    private String typeName;

    private Integer typeCategory;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(Integer typeCategory) {
        this.typeCategory = typeCategory;
    }
}