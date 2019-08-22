package com.ralei.service.ServiceImpl;

import com.ralei.dao.recycledao.RecyleDao;
import com.ralei.pojo.RlActionRecord;
import com.ralei.pojo.SysFileUpload;
import com.ralei.service.RecycleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RecycleServiceImpl implements RecycleService {

    @Autowired
    private RecyleDao recyleDao;

    /*回收站查询文件列表*/
    @Override
    public List<SysFileUpload> selectRecycleFileList() {
        return recyleDao.selectRecycleFileList();
    }

    /*回收站删除文件*/
    @Override
    public Integer deleteFileByFileId(Integer fileId) {
        return recyleDao.deleteFileByFileId(fileId);
    }

    /*删除文件对应的操作记录*/
    @Override
    public Integer deleteRlactionRecord(Integer fileId) {
        return recyleDao.deleteRlactionRecord(fileId);
    }

    /*回收站恢复文件*/
    @Override
    public Integer recoverFileByFileId(Integer fileId) {
        return recyleDao.recoverFileByFileId(fileId);
    }

    /*查看文件操作记录*/
    @Override
    public List<RlActionRecord> selectFileRecordList(Integer fileId) {
        return recyleDao.selectFileRecordList(fileId);
    }
}
