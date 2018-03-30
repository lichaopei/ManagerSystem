package com.guigu.system.po;

import java.util.Date;

public class Sign {
    private Integer employeeId;

    private Integer sign;

    private Integer unSign;

    private Date yearMonth;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public Integer getUnSign() {
        return unSign;
    }

    public void setUnSign(Integer unSign) {
        this.unSign = unSign;
    }

    public Date getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(Date yearMonth) {
        this.yearMonth = yearMonth;
    }
}