package com.jxd.emp.model;

public class Teacher {
    private int tId;
    private String tName;
    private int pId;

    public Teacher(int tId, String tName, int pId) {
        this.tId = tId;
        this.tName = tName;
        this.pId = pId;
    }

    public Teacher() {
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }
}
