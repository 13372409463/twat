package com.ralei.pojo;

import java.util.Date;

public class RlWorkplans {
    private Integer wpId;

    private String wpName;

    private Date wpStarttime;

    private Date wpEndtime;

    private String wpContent;

    private Integer wpKeypoint;

    private Integer wpProspectPerformance;

    private Integer wpActualPerformance;

    private String wpRemark;

    private Date wpCreatedate;

    private Integer wpStatus;

    private Integer wpEmployee;

    public Integer getWpId() {
        return wpId;
    }

    public void setWpId(Integer wpId) {
        this.wpId = wpId;
    }

    public String getWpName() {
        return wpName;
    }

    public void setWpName(String wpName) {
        this.wpName = wpName == null ? null : wpName.trim();
    }

    public Date getWpStarttime() {
        return wpStarttime;
    }

    public void setWpStarttime(Date wpStarttime) {
        this.wpStarttime = wpStarttime;
    }

    public Date getWpEndtime() {
        return wpEndtime;
    }

    public void setWpEndtime(Date wpEndtime) {
        this.wpEndtime = wpEndtime;
    }

    public String getWpContent() {
        return wpContent;
    }

    public void setWpContent(String wpContent) {
        this.wpContent = wpContent == null ? null : wpContent.trim();
    }

    public Integer getWpKeypoint() {
        return wpKeypoint;
    }

    public void setWpKeypoint(Integer wpKeypoint) {
        this.wpKeypoint = wpKeypoint;
    }

    public Integer getWpProspectPerformance() {
        return wpProspectPerformance;
    }

    public void setWpProspectPerformance(Integer wpProspectPerformance) {
        this.wpProspectPerformance = wpProspectPerformance;
    }

    public Integer getWpActualPerformance() {
        return wpActualPerformance;
    }

    public void setWpActualPerformance(Integer wpActualPerformance) {
        this.wpActualPerformance = wpActualPerformance;
    }

    public String getWpRemark() {
        return wpRemark;
    }

    public void setWpRemark(String wpRemark) {
        this.wpRemark = wpRemark == null ? null : wpRemark.trim();
    }

    public Date getWpCreatedate() {
        return wpCreatedate;
    }

    public void setWpCreatedate(Date wpCreatedate) {
        this.wpCreatedate = wpCreatedate;
    }

    public Integer getWpStatus() {
        return wpStatus;
    }

    public void setWpStatus(Integer wpStatus) {
        this.wpStatus = wpStatus;
    }

    public Integer getWpEmployee() {
        return wpEmployee;
    }

    public void setWpEmployee(Integer wpEmployee) {
        this.wpEmployee = wpEmployee;
    }
}