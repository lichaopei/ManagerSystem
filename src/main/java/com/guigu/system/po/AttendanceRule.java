package com.guigu.system.po;

import java.util.Date;

public class AttendanceRule {
    @Override
	public String toString() {
		return "AttendanceRule [ruleId=" + ruleId + ", departmentId=" + departmentId + ", startTimeAm=" + startTimeAm
				+ ", endTimeAm=" + endTimeAm + ", startTimePm=" + startTimePm + ", endTimePm=" + endTimePm + "]";
	}

	private Integer ruleId;

    private Integer departmentId;

    private Date startTimeAm;

    private Date endTimeAm;

    private Date startTimePm;

    private Date endTimePm;

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Date getStartTimeAm() {
        return startTimeAm;
    }

    public void setStartTimeAm(Date startTimeAm) {
        this.startTimeAm = startTimeAm;
    }

    public Date getEndTimeAm() {
        return endTimeAm;
    }

    public void setEndTimeAm(Date endTimeAm) {
        this.endTimeAm = endTimeAm;
    }

    public Date getStartTimePm() {
        return startTimePm;
    }

    public void setStartTimePm(Date startTimePm) {
        this.startTimePm = startTimePm;
    }

    public Date getEndTimePm() {
        return endTimePm;
    }

    public void setEndTimePm(Date endTimePm) {
        this.endTimePm = endTimePm;
    }
}