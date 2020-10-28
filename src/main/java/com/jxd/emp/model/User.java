package com.jxd.emp.model;

public class User {
    private int pId;
    private String account;//账号
    private String password;//密码
    private int role;//角色  1学员，2老师，3经理，4管理员

    public User() {
    }

    public User(int pId, String account, String password, int role) {
        this.pId = pId;
        this.account = account;
        this.password = password;
        this.role = role;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
