package com.jxd.emp.model;

public class EvaluationOption {
    private int eId;//评价分项id
    private String eType;//评价分项

    public EvaluationOption(int eId, String eType) {
        this.eId = eId;
        this.eType = eType;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteType() {
        return eType;
    }

    public void seteType(String eType) {
        this.eType = eType;
    }

    public EvaluationOption() {
    }
}
