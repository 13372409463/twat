package com.ralei.controller.login.personalfile;

import com.ralei.pojo.RlActionRecord;
import com.ralei.pojo.SysFileUpload;
import com.ralei.service.PersonalFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName
 * @Description 我的上传
 * @Author xfx
 * @Date 2019/8/14 9:03
 **/
@Controller
@RequestMapping("/personalfile")
public class PersonalFileController {

    @Autowired
    private PersonalFileService  personalFileService;
    /**
     * @Author xfx
     * @Date 10:26 2019/8/14
     * @Param [emId]
     * 我的上传文件列表查询
     **/

    @RequestMapping("/selectFileListByemId")
    public String selectFileListByemId(Integer emId){
        List<SysFileUpload>  sysFileUploadList=personalFileService.selectFileListByemId(emId);
        return null;
    }

    /**
     * @Author xfx
     * @Date 10:36 2019/8/14
     * @Param
     *
     *
     *
     * 删除文件,1 将文件状态设置为回收站状态,2 向操作记录表添加一条记录
     **/
    @RequestMapping("/deleteFileByFileId")
    public  String deleteFileByFileId(Integer fileId){
        Integer result=personalFileService.deleteFileByFileId(fileId);
        RlActionRecord rlActionRecord=new RlActionRecord();
        rlActionRecord.setFileId(fileId);
        rlActionRecord.setActionKinds(0);
        Integer addResult=personalFileService.addRlActionRecord(rlActionRecord);
        return null;
    }

}
