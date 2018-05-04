package com.guigu.system.po;

public class SalaryRule {
    private Integer salaryId;

    private Integer positionId;

    private Double baseSalary;

    private Double positionSalary;

    private Double targetMoney;

    private Double upPercent;

    private Double jxPercent;

    private Double scoreMoney;

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

    public Double getTargetMoney() {
        return targetMoney;
    }

    public void setTargetMoney(Double targetMoney) {
        this.targetMoney = targetMoney;
    }

    public Double getUpPercent() {
        return upPercent;
    }

    public void setUpPercent(Double upPercent) {
        this.upPercent = upPercent;
    }

    public Double getJxPercent() {
        return jxPercent;
    }

    public void setJxPercent(Double jxPercent) {
        this.jxPercent = jxPercent;
    }

    public Double getScoreMoney() {
        return scoreMoney;
    }

    public void setScoreMoney(Double scoreMoney) {
        this.scoreMoney = scoreMoney;
    }
}