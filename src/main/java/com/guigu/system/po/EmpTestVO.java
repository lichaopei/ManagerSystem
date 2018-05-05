package com.guigu.system.po;

public class EmpTestVO extends EmpTest{
	private String employeeName;
	
	private Integer department;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmpTestVO [employeeName=" + employeeName + ", toString()=" + super.toString() + "]";
	}
	
	
}
