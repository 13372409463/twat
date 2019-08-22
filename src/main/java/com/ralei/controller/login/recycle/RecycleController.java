package com.ralei.controller.login.recycle;

import com.ralei.pojo.RlActionRecord;
import com.ralei.pojo.SysFileUpload;
import com.ralei.service.PersonalFileService;
import com.ralei.service.RecycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName
 * @Description 回收站
 * @Author
 * @Date 2019/8/14 13:53
 * @Version 1.0
 **/
@Controller
@RequestMapping("/recycle")
public class RecycleController {

    @Autowired
    private RecycleService recycleService;

    @Autowired
    private PersonalFileService personalFileService;

    /**
     * @Author xfx
     * @Date 14:08 2019/8/14
     * @Param []
     * 回收站查询文件列表
     **/
    @RequestMapping("/recycle")
    public String selectRecycleFileList(){
        List<SysFileUpload> sysFileUploadList=recycleService.selectRecycleFileList();
        return null;
    }

    /**
     * @Author xfx
     * @Date 14:09 2019/8/14
     * @Param
     * 1 回收站删除文件 2删除文件后并删除对应的操作记录
     **/
    @RequestMapping("/deleteFileByFileId")
    public String deleteFileByFileId(Integer fileId){
        Integer result=recycleService.deleteFileByFileId(fileId);
        /*删除文件后并删除对应的操作记录*/
        Integer deleteRecord=recycleService.deleteRlactionRecord(fileId);
        return null;
    }

    /**
     * @Author xfx
     * @Date 14:09 2019/8/14
     * @Param
     * 回收站恢复文件,添加该文件的操作记录
     **/
    @RequestMapping("/recoverFileByFileId")
    public String recoverFileByFileId(Integer fileId){
        Integer result=recycleService.recoverFileByFileId(fileId);
        /*添加该文件的操作记录*/
        RlActionRecord rlActionRecord=new RlActionRecord();
        rlActionRecord.setFileId(fileId);
        rlActionRecord.setActionKinds(3);
        Integer addResult=personalFileService.addRlActionRecord(rlActionRecord);
        return null;
    }
    /**
     * @Author xfx
     * @Date 14:20 2019/8/14
     * @Param
     * 查看文件操作记录
     **/
    @RequestMapping("/selectFileRecordList")
    public String selectFileRecordList(Integer fileId){
          List<RlActionRecord> rlActionRecordList=recycleService.selectFileRecordList(fileId);
          return null;
    }
}
