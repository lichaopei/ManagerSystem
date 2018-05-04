package com.guigu.system.po;

public class AttendanceRecordVO extends AttendanceRecord{
	private String employeeName;
	private String typeName;
	private String adminName;
	private String departmentName;
	private int typeCategory;
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getTypeCategory() {
		return typeCategory;
	}
	public void setTypeCategory(int typeCategory) {
		this.typeCategory = typeCategory;
	}
	
	
}
