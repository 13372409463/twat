package com.ralei.service.ServiceImpl;

import com.ralei.dao.personalfiledao.PersonalFileDao;
import com.ralei.pojo.RlActionRecord;
import com.ralei.pojo.SysFileUpload;
import com.ralei.service.PersonalFileService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author
 * @Date 2019/8/14 10:23
 * @Version 1.0
 **/
public class PersonalFileServiceImpl implements PersonalFileService {

    @Autowired
    private PersonalFileDao  personalFileDao;

    /*我的文件列表查询*/
    @Override
    public List<SysFileUpload> selectFileListByemId(Integer emId) {
        return personalFileDao.selectFileListByemId(emId);
    }

    /*删除文件*/
    @Override
    public Integer deleteFileByFileId(Integer fileId) {
        return null;
    }

    /*删除文件后添加该文件的操作记录*/
    @Override
    public Integer addRlActionRecord(RlActionRecord rlActionRecord) {
        rlActionRecord.setActionTime(new Date());
        rlActionRecord.setActionName("token里面封装的");
        return null;
    }
}
