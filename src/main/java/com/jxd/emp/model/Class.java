package com.jxd.emp.model;

/**
 * @ClassName Dept
 * @Description TODO
 * @Author wang kunpeng
 * @Date 2020/10/23
 * @Version 1.0
 */

public class Class {
    private int classId;//班级id
    private String className;//班级名称
    private int tId;//老师

    public Class(int classId, String className, int tId) {
        this.classId = classId;
        this.className = className;
        this.tId = tId;
    }

    public Class() {
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }
}

