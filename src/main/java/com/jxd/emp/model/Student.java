package com.jxd.emp.model;

public class Student {
    private int sId;
    private String sName;
    private String sex;
    private String address;
    private String nation;
    private String birthday;
    private int marriage;//婚否  0否
    private String tel;
    private String IDNumber;//身份证号
    private String school;
    private String major;
    private int classId;
    private int pId;
    private String photo;

    public Student() {
    }

    public Student(int sId, String sName, String sex, String address, String nation, String birthday, int marriage, String tel, String IDNumber, String school, String major, int classId, int pId, String photo) {

        this.sId = sId;
        this.sName = sName;
        this.sex = sex;
        this.address = address;
        this.nation = nation;
        this.birthday = birthday;
        this.marriage = marriage;
        this.tel = tel;
        this.IDNumber = IDNumber;
        this.school = school;
        this.major = major;
        this.classId = classId;
        this.pId = pId;
        this.photo = photo;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getMarriage() {
        return marriage;
    }

    public void setMarriage(int marriage) {
        this.marriage = marriage;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
