package com.ralei.pojo;

import org.springframework.context.annotation.Bean;

import java.io.Serializable;
import java.util.Date;

public class SysEmployee implements Serializable{
    private Integer emId;

    private String emName;

    private String emPhone;

    private Integer emPosition;

    private Integer emStatus;

    private String emCompany;

    private String emIdcard;

    private Date emCreatedate;

    private Date emLeftdate;

    private String emEngname;

    private String username;

    private String password;

    private Integer fileId;

    private Integer deptId;

    private Integer wpId;

    public Integer getEmId() {
        return emId;
    }

    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName == null ? null : emName.trim();
    }

    public String getEmPhone() {
        return emPhone;
    }

    public void setEmPhone(String emPhone) {
        this.emPhone = emPhone == null ? null : emPhone.trim();
    }

    public Integer getEmPosition() {
        return emPosition;
    }

    public void setEmPosition(Integer emPosition) {
        this.emPosition = emPosition;
    }

    public Integer getEmStatus() {
        return emStatus;
    }

    public void setEmStatus(Integer emStatus) {
        this.emStatus = emStatus;
    }

    public String getEmCompany() {
        return emCompany;
    }

    public void setEmCompany(String emCompany) {
        this.emCompany = emCompany == null ? null : emCompany.trim();
    }

    public String getEmIdcard() {
        return emIdcard;
    }

    public void setEmIdcard(String emIdcard) {
        this.emIdcard = emIdcard == null ? null : emIdcard.trim();
    }

    public Date getEmCreatedate() {
        return emCreatedate;
    }

    public void setEmCreatedate(Date emCreatedate) {
        this.emCreatedate = emCreatedate;
    }

    public Date getEmLeftdate() {
        return emLeftdate;
    }

    public void setEmLeftdate(Date emLeftdate) {
        this.emLeftdate = emLeftdate;
    }

    public String getEmEngname() {
        return emEngname;
    }

    public void setEmEngname(String emEngname) {
        this.emEngname = emEngname == null ? null : emEngname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getWpId() {
        return wpId;
    }

    public void setWpId(Integer wpId) {
        this.wpId = wpId;
    }
}