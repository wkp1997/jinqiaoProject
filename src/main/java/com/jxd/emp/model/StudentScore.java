package com.jxd.emp.model;

public class StudentScore {
    private int sId;//成绩表
    private int cId;//课程表
    private String score;//得分

    public StudentScore(int sId, int cId, String score) {
        this.sId = sId;
        this.cId = cId;
        this.score = score;
    }

    public StudentScore() {
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
