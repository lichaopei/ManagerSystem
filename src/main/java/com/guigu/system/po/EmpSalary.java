package com.guigu.system.po;

public class EmpSalary {
    private Integer salaryId;

    private String empId;

    private Double baseSalary;

    private Double testSalary;

    private Double benefits;

    private Double scottare;

    private Double realSalary;

    private String yearMonth;

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Double getTestSalary() {
        return testSalary;
    }

    public void setTestSalary(Double testSalary) {
        this.testSalary = testSalary;
    }

    public Double getBenefits() {
        return benefits;
    }

    public void setBenefits(Double benefits) {
        this.benefits = benefits;
    }

    public Double getScottare() {
        return scottare;
    }

    public void setScottare(Double scottare) {
        this.scottare = scottare;
    }

    public Double getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(Double realSalary) {
        this.realSalary = realSalary;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth == null ? null : yearMonth.trim();
    }
}