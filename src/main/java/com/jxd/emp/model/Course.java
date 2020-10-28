package com.jxd.emp.model;

public class Course {
    private int cId;//课程id
    private String cName;//课程名称

    public Course(int cId, String cName) {
        this.cId = cId;
        this.cName = cName;
    }

    public Course() {
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
