package com.ralei.dao.recycledao;

import com.ralei.pojo.RlActionRecord;
import com.ralei.pojo.SysFileUpload;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecyleDao {

    /*回收站查询文件列表*/
    List<SysFileUpload> selectRecycleFileList();

    /*回收站删除文件*/
    Integer deleteFileByFileId(Integer fileId);

    /*删除文件对应的操作记录*/
    Integer deleteRlactionRecord(Integer fileId);

    /*回收站恢复文件*/
    Integer recoverFileByFileId(Integer fileId);

    /*查看文件操作记录*/
    List<RlActionRecord> selectFileRecordList(Integer fileId);

}
