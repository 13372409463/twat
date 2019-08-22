package com.ralei.pojo;

import java.util.Date;

public class SysFileUpload {
    private Integer fileId;

    private Date fileCreatedate;

    private Date fileDeletedate;

    private String filePath;

    private Integer fileReadaccount;

    private Integer filePriority;

    private Integer fileKinds;

    private Integer fileStatus;

    private Integer actionId;

    private String fileName;

    private String fileUploader;

    private Integer emId;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Date getFileCreatedate() {
        return fileCreatedate;
    }

    public void setFileCreatedate(Date fileCreatedate) {
        this.fileCreatedate = fileCreatedate;
    }

    public Date getFileDeletedate() {
        return fileDeletedate;
    }

    public void setFileDeletedate(Date fileDeletedate) {
        this.fileDeletedate = fileDeletedate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Integer getFileReadaccount() {
        return fileReadaccount;
    }

    public void setFileReadaccount(Integer fileReadaccount) {
        this.fileReadaccount = fileReadaccount;
    }

    public Integer getFilePriority() {
        return filePriority;
    }

    public void setFilePriority(Integer filePriority) {
        this.filePriority = filePriority;
    }

    public Integer getFileKinds() {
        return fileKinds;
    }

    public void setFileKinds(Integer fileKinds) {
        this.fileKinds = fileKinds;
    }

    public Integer getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(Integer fileStatus) {
        this.fileStatus = fileStatus;
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileUploader() {
        return fileUploader;
    }

    public void setFileUploader(String fileUploader) {
        this.fileUploader = fileUploader == null ? null : fileUploader.trim();
    }

    public Integer getEmId() {
        return emId;
    }

    public void setEmId(Integer emId) {
        this.emId = emId;
    }
}