package com.jxd.emp.model;

public class EmpScore {
    private int empId;//工作后的得分Id，关联员工表eId
    private String score;//得分，默认为未评价
    private String yId;//年次Id，关联年次表，判断第几年
    private int evaluationId;//评价分项id，关联评价分项表

    public EmpScore(int empId, String score, String yId, int evaluationId) {
        this.empId = empId;
        this.score = score;
        this.yId = yId;
        this.evaluationId = evaluationId;

    }

    public EmpScore() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getyId() {
        return yId;
    }

    public void setyId(String yId) {
        this.yId = yId;
    }

    public int getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(int evaluationId) {
        this.evaluationId = evaluationId;
    }
}
