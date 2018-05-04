package com.guigu.system.po;

public class EmpTest {
    private Integer testId;

    private Integer empId;

    private Double baseSalary;

    private Double positionSalary;

    private Double upSalary;

    private Double jxSalary;

    private Double allSalary;

    private Double testScore;

    private String testDate;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Double getPositionSalary() {
        return positionSalary;
    }

    public void setPositionSalary(Double positionSalary) {
        this.positionSalary = positionSalary;
    }

    public Double getUpSalary() {
        return upSalary;
    }

    public void setUpSalary(Double upSalary) {
        this.upSalary = upSalary;
    }

    public Double getJxSalary() {
        return jxSalary;
    }

    public void setJxSalary(Double jxSalary) {
        this.jxSalary = jxSalary;
    }

    public Double getAllSalary() {
        return allSalary;
    }

    public void setAllSalary(Double allSalary) {
        this.allSalary = allSalary;
    }

    public Double getTestScore() {
        return testScore;
    }

    public void setTestScore(Double testScore) {
        this.testScore = testScore;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate == null ? null : testDate.trim();
    }

	@Override
	public String toString() {
		return "EmpTest [testId=" + testId + ", empId=" + empId + ", baseSalary=" + baseSalary + ", positionSalary="
				+ positionSalary + ", upSalary=" + upSalary + ", jxSalary=" + jxSalary + ", allSalary=" + allSalary
				+ ", testScore=" + testScore + ", testDate=" + testDate + "]";
	}
    
    
}