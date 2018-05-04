package com.guigu.system.po;

public class EmpTestVO extends EmpTest{
	private String employeeName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "EmpTestVO [employeeName=" + employeeName + ", toString()=" + super.toString() + "]";
	}
	
	
}
