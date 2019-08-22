package com.ralei.service;

import com.ralei.pojo.RlActionRecord;
import com.ralei.pojo.SysFileUpload;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonalFileService {

    /*我的上传文件列表*/
    List<SysFileUpload>  selectFileListByemId(Integer emId);

    /*删除文件*/
    Integer deleteFileByFileId(Integer fileId);

    /*删除文件后添加该文件的操作记录*/
    Integer addRlActionRecord(RlActionRecord rlActionRecord);

}
