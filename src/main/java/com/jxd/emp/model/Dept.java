package com.jxd.emp.model;

public class Dept {
    private int deptNo;//课程编号
    private String dName;//课程名称

    public Dept(int deptNo, String dName) {
        this.deptNo = deptNo;
        this.dName = dName;
    }

    public Dept() {
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }
}
