package com.guigu.system.po;

import java.util.Date;

public class OvertimeRecord {
    private Integer overtimeId;

    private Integer employeeId;

    private Date overtimeDate;

    private String overtimeFlag;

    private String overtimeState;

    private Boolean isVerify;

    private String overtimeMemo;

    private Integer operatorId;

    private Integer noteId;

    public Integer getOvertimeId() {
        return overtimeId;
    }

    public void setOvertimeId(Integer overtimeId) {
        this.overtimeId = overtimeId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getOvertimeDate() {
        return overtimeDate;
    }

    public void setOvertimeDate(Date overtimeDate) {
        this.overtimeDate = overtimeDate;
    }

    public String getOvertimeFlag() {
        return overtimeFlag;
    }

    public void setOvertimeFlag(String overtimeFlag) {
        this.overtimeFlag = overtimeFlag == null ? null : overtimeFlag.trim();
    }

    public String getOvertimeState() {
        return overtimeState;
    }

    public void setOvertimeState(String overtimeState) {
        this.overtimeState = overtimeState == null ? null : overtimeState.trim();
    }

    public Boolean getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(Boolean isVerify) {
        this.isVerify = isVerify;
    }

    public String getOvertimeMemo() {
        return overtimeMemo;
    }

    public void setOvertimeMemo(String overtimeMemo) {
        this.overtimeMemo = overtimeMemo == null ? null : overtimeMemo.trim();
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }
}