package com.guigu.system.po;

import java.util.Date;

public class Orders {
    private Integer orderId;

    private Integer typeId;

    private String customer;

    private String phone;

    private Date date;

    private Double frontCost;

    private Double secondCost;

    private String flag;

    private Integer floor;

    private Integer makeUp;

    private Integer photo;

    private Integer ps;

    private Integer choose;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getFrontCost() {
        return frontCost;
    }

    public void setFrontCost(Double frontCost) {
        this.frontCost = frontCost;
    }

    public Double getSecondCost() {
        return secondCost;
    }

    public void setSecondCost(Double secondCost) {
        this.secondCost = secondCost;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getMakeUp() {
        return makeUp;
    }

    public void setMakeUp(Integer makeUp) {
        this.makeUp = makeUp;
    }

    public Integer getPhoto() {
        return photo;
    }

    public void setPhoto(Integer photo) {
        this.photo = photo;
    }

    public Integer getPs() {
        return ps;
    }

    public void setPs(Integer ps) {
        this.ps = ps;
    }

    public Integer getChoose() {
        return choose;
    }

    public void setChoose(Integer choose) {
        this.choose = choose;
    }
}