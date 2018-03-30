package com.guigu.system.po;

import java.util.Date;

public class Notes {
    private Integer noteId;

    private Integer departmentId;

    private Integer employeeId;

    private Integer nodeType;

    private String employeeIds;

    private String cause;

    private Date fillinTime;

    private String directorSign;

    private String adminnistrationSign;

    private String presidentSign;

    private Date startDate;

    private Date startTime;

    private Date endDate;

    private Date endTime;

    private String overtimeIds;

    private String vehicle;

    private Integer adminId;

    private String noteMemo;

    private Integer operatorId;

    private Boolean isVerify;

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(String employeeIds) {
        this.employeeIds = employeeIds == null ? null : employeeIds.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public Date getFillinTime() {
        return fillinTime;
    }

    public void setFillinTime(Date fillinTime) {
        this.fillinTime = fillinTime;
    }

    public String getDirectorSign() {
        return directorSign;
    }

    public void setDirectorSign(String directorSign) {
        this.directorSign = directorSign == null ? null : directorSign.trim();
    }

    public String getAdminnistrationSign() {
        return adminnistrationSign;
    }

    public void setAdminnistrationSign(String adminnistrationSign) {
        this.adminnistrationSign = adminnistrationSign == null ? null : adminnistrationSign.trim();
    }

    public String getPresidentSign() {
        return presidentSign;
    }

    public void setPresidentSign(String presidentSign) {
        this.presidentSign = presidentSign == null ? null : presidentSign.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getOvertimeIds() {
        return overtimeIds;
    }

    public void setOvertimeIds(String overtimeIds) {
        this.overtimeIds = overtimeIds == null ? null : overtimeIds.trim();
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle == null ? null : vehicle.trim();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getNoteMemo() {
        return noteMemo;
    }

    public void setNoteMemo(String noteMemo) {
        this.noteMemo = noteMemo == null ? null : noteMemo.trim();
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Boolean getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(Boolean isVerify) {
        this.isVerify = isVerify;
    }
}