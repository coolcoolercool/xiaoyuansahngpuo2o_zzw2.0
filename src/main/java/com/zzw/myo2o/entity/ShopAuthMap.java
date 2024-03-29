package com.zzw.myo2o.entity;

import java.util.Date;

/**
 * author: zzw5005
 * date: 2018/10/24 16:00
 */

/**
 * 店铺授权
 */
public class ShopAuthMap {
    //主键Id
    private Long shopAuthId;
    private Long employeeId;
    private Long shopId;
    private String name;
    //职务名
    private String title;
    //授权有效状态 0无效 1有效
    private Integer enableStatus;
    //职称符号(可用于授权控制)
    private Integer titleFlag;
    private Date createTime;
    private Date lastEditTime;
    //员工信息实体类
    private PersonInfo employee;
    //店铺实体类
    private Shop shop;

    public Long getShopAuthId() {
        return shopAuthId;
    }

    public void setShopAuthId(Long shopAuthId) {
        this.shopAuthId = shopAuthId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTitleFlag() {
        return titleFlag;
    }

    public void setTitleFlag(Integer titleFlag) {
        this.titleFlag = titleFlag;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public PersonInfo getEmployee() {
        return employee;
    }

    public void setEmployee(PersonInfo employee) {
        this.employee = employee;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "ShopAuthMap{" +
                "shopAuthId=" + shopAuthId +
                ", employeeId=" + employeeId +
                ", shopId=" + shopId +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", titleFlag=" + titleFlag +
                ", enableStatus=" + enableStatus +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                ", employee=" + employee +
                ", shop=" + shop +
                '}';
    }
}
