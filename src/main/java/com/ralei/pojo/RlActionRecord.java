package com.ralei.pojo;

import java.util.Date;

public class RlActionRecord {
    private Integer actionId;

    private Date actionTime;

    private Integer actionKinds;

    private String actionName;

    private Integer fileId;

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    public Integer getActionKinds() {
        return actionKinds;
    }

    public void setActionKinds(Integer actionKinds) {
        this.actionKinds = actionKinds;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }
}