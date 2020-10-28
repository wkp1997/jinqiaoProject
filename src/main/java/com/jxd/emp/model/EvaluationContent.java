package com.jxd.emp.model;

public class EvaluationContent {
    //评价内容表
    private String content;//评价内容
    private int sid;//被评家人1
    private int empId;//被评家人2
    private int tId;//评价人1
    private int managerId;//评价人2
    //上面两个一一对应，且只能同时存在一组
    private int yId;//年次
    private int score;//总体评价得分
    private String time;//评价时间

    public EvaluationContent(String content, int sid, int empId, int tId, int managerId, int yId, int score, String time) {
        this.content = content;
        this.sid = sid;
        this.empId = empId;
        this.tId = tId;
        this.managerId = managerId;
        this.yId = yId;
        this.score = score;
        this.time = time;
    }

    public EvaluationContent() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getyId() {
        return yId;
    }

    public void setyId(int yId) {
        this.yId = yId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
