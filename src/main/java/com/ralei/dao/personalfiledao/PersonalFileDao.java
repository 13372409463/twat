package com.ralei.dao.personalfiledao;

import com.ralei.pojo.RlActionRecord;
import com.ralei.pojo.SysFileUpload;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonalFileDao {
    /*我的上传文件列表*/
    List<SysFileUpload> selectFileListByemId(Integer emId);

    /*删除文件*/
    Integer deleteFileByFileId(Integer fileId);

    /*删除文件后添加该文件的操作记录*/
    Integer addRlActionRecord(RlActionRecord rlActionRecord);
}
