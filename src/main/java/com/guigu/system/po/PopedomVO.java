package com.guigu.system.po;

public class PopedomVO extends AdminPopedom{
	private String adminName;
	private String departmentName;
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
	@Override
	public String toString() {
		return "PopedomVO [adminName=" + adminName + ", departmentName=" + departmentName + "]";
	}
	

}
