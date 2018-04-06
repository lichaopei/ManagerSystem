package com.guigu.system.po;

public class Temp {
    private Integer tempId;

    private Integer employeeId;

    private String cardNumber;

    private Integer tempDepartmentId;

    public Integer getTempId() {
        return tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public Integer getTempDepartmentId() {
        return tempDepartmentId;
    }

    public void setTempDepartmentId(Integer tempDepartmentId) {
        this.tempDepartmentId = tempDepartmentId;
    }
}