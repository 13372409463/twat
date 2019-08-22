package com.ralei.dao;

import com.ralei.pojo.SysFileUpload;

public interface SysFileUploadMapper {
    int deleteByPrimaryKey(Integer fileId);

    int insert(SysFileUpload record);

    int insertSelective(SysFileUpload record);

    SysFileUpload selectByPrimaryKey(Integer fileId);

    int updateByPrimaryKeySelective(SysFileUpload record);

    int updateByPrimaryKey(SysFileUpload record);
}