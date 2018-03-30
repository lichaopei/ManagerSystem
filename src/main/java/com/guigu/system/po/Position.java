package com.guigu.system.po;

public class Position {
    private Integer positionId;

    private String positionName;

    private String positionMemo;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getPositionMemo() {
        return positionMemo;
    }

    public void setPositionMemo(String positionMemo) {
        this.positionMemo = positionMemo == null ? null : positionMemo.trim();
    }
}