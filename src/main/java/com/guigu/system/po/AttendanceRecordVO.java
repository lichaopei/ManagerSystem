package com.guigu.system.po;

public class AttendanceRecordVO extends AttendanceRecord{
	private String employeeName;
	private String typeName;
	private String adminName;
	private String departmentName;
	private int typeCategory;
	private int cq;
	private int cd;
	private int gx;
	private int kg;
	private int qj;
	private int bt;
	
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

	public int getCq() {
		return cq;
	}
	public void setCq(int cq) {
		this.cq = cq;
	}
	public int getCd() {
		return cd;
	}
	public void setCd(int cd) {
		this.cd = cd;
	}
	public int getGx() {
		return gx;
	}
	public void setGx(int gx) {
		this.gx = gx;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	public int getQj() {
		return qj;
	}
	public void setQj(int qj) {
		this.qj = qj;
	}
	public int getBt() {
		return bt;
	}
	public void setBt(int bt) {
		this.bt = bt;
	}
}
