package com.jxd.emp.model;

/**
 * @ClassName Emp
 * @Description TODO
 * @Author wang kunpeng
 * @Date 2020/10/23
 * @Version 1.0
 */

public class Emp {
   private int eId;//员工id
    private String job;//员工工作
    private int deptNo;//员工所属部门编号
    private String name ;//姓名
    private String sex;//性别
    private String nation;//民族
    private String birth;//出生年月
    private String address;//籍贯
    private int marry;//婚否，0为否，1为是
    private String tel;//联系电话
    private String IDCard;//身份证号
    private String school ;//毕业院校
    private String major;//专业
    private String photo;//照片
    private String note;//备注
    private int pId;//用户表id，根据这个得出账号密码，员工还是经理

    public Emp(int eId, String job, int deptNo, String name, String sex, String nation, String birth, String address, int marry, String tel, String IDCard, String school, String major, String photo, String note, int pId) {
        this.eId = eId;
        this.job = job;
        this.deptNo = deptNo;
        this.name = name;
        this.sex = sex;
        this.nation = nation;
        this.birth = birth;
        this.address = address;
        this.marry = marry;
        this.tel = tel;
        this.IDCard = IDCard;
        this.school = school;
        this.major = major;
        this.photo = photo;
        this.note = note;
        this.pId = pId;
    }

    public Emp() {
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarry() {
        return marry;
    }

    public void setMarry(int marry) {
        this.marry = marry;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }
}
