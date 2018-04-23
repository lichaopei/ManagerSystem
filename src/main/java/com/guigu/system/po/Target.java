package com.guigu.system.po;

public class Target {
    private Integer targetId;

    private String targetName;

    private Integer targetLevel;

    private String remarks;

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName == null ? null : targetName.trim();
    }

    public Integer getTargetLevel() {
        return targetLevel;
    }

    public void setTargetLevel(Integer targetLevel) {
        this.targetLevel = targetLevel;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

	@Override
	public String toString() {
		return "Target [targetId=" + targetId + ", targetName=" + targetName + ", targetLevel=" + targetLevel
				+ ", remarks=" + remarks + "]";
	}
    
    
}