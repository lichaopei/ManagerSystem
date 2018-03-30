package com.guigu.system.po;

public class SalaryRule {
    private Integer salaryId;

    private Integer positionId;

    private Double pv;

    private Double skillWage;

    private String auxiliaryWage;

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Double getPv() {
        return pv;
    }

    public void setPv(Double pv) {
        this.pv = pv;
    }

    public Double getSkillWage() {
        return skillWage;
    }

    public void setSkillWage(Double skillWage) {
        this.skillWage = skillWage;
    }

    public String getAuxiliaryWage() {
        return auxiliaryWage;
    }

    public void setAuxiliaryWage(String auxiliaryWage) {
        this.auxiliaryWage = auxiliaryWage == null ? null : auxiliaryWage.trim();
    }
}