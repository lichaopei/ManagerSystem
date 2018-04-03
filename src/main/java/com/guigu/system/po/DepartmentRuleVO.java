package com.guigu.system.po;

public class DepartmentRuleVO extends AttendanceRule{
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "DepartmentRuleVO [departmentName=" + departmentName + ", toString()=" + super.toString()
				+ ", getRuleId()=" + getRuleId() + ", getDepartmentId()=" + getDepartmentId() + ", getStartTimeAm()="
				+ getStartTimeAm() + ", getEndTimeAm()=" + getEndTimeAm() + ", getStartTimePm()=" + getStartTimePm()
				+ ", getEndTimePm()=" + getEndTimePm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
