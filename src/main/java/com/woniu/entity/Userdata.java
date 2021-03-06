package com.woniu.entity;

import java.io.Serializable;

public class Userdata implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer dataid;

    private String uname;

    private Integer sex;

    private Integer age;

    private String adress;

    private String photoOne;

    private String photoTwo;

    private String cardid;

    private String cause;

    private String remark;

    private String company;

    private String position;

    private String income;

    private Integer uid;

    public Integer getDataid() {
        return dataid;
    }

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhotoOne() {
        return photoOne;
    }

    public void setPhotoOne(String photoOne) {
        this.photoOne = photoOne;
    }

    public String getPhotoTwo() {
        return photoTwo;
    }

    public void setPhotoTwo(String photoTwo) {
        this.photoTwo = photoTwo;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

	@Override
	public String toString() {
		return "Userdata [dataid=" + dataid + ", uname=" + uname + ", sex=" + sex + ", age=" + age + ", adress="
				+ adress + ", photoOne=" + photoOne + ", photoTwo=" + photoTwo + ", cardid=" + cardid + ", cause="
				+ cause + ", remark=" + remark + ", company=" + company + ", position=" + position + ", income="
				+ income + ", uid=" + uid + "]";
	}
    
}