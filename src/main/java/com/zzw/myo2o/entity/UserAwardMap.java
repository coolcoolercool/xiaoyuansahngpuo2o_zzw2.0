package com.zzw.myo2o.entity;

import java.util.Date;
/*
* 顾客已领取的奖品映射
* */
public class UserAwardMap {

	private Long userAwardId;
	private Long userId;
	private Long awardId;
	private Long shopId;
	private String userName;
	private String awardName;
	private Date expireTime;
	private Date createTime;
	//使用状态 0未兑换 1已兑换
	private Integer usedStatus;
	//领取奖品所消耗的积分
	private Integer point;
	//操作员工信息实体类
	private PersonInfo user;
	private Award award;
	//店铺信息实体类
	private Shop shop;

	public Long getUserAwardId() {
		return userAwardId;
	}

	public void setUserAwardId(Long userAwardId) {
		this.userAwardId = userAwardId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getAwardId() {
		return awardId;
	}

	public void setAwardId(Long awardId) {
		this.awardId = awardId;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getUsedStatus() {
		return usedStatus;
	}

	public void setUsedStatus(Integer usedStatus) {
		this.usedStatus = usedStatus;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public PersonInfo getUser() {
		return user;
	}

	public void setUser(PersonInfo user) {
		this.user = user;
	}

	public Award getAward() {
		return award;
	}

	public void setAward(Award award) {
		this.award = award;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	@Override
	public String toString() {
		return "UserAwardMap{" +
				"userAwardId=" + userAwardId +
				", userId=" + userId +
				", awardId=" + awardId +
				", shopId=" + shopId +
				", userName='" + userName + '\'' +
				", awardName='" + awardName + '\'' +
				", expireTime=" + expireTime +
				", createTime=" + createTime +
				", usedStatus=" + usedStatus +
				", point=" + point +
				", user=" + user +
				", award=" + award +
				", shop=" + shop +
				'}';
	}
}
