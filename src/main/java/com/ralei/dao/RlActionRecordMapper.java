package com.ralei.dao;

import com.ralei.pojo.RlActionRecord;

public interface RlActionRecordMapper {
    int deleteByPrimaryKey(Integer actionId);

    int insert(RlActionRecord record);

    int insertSelective(RlActionRecord record);

    RlActionRecord selectByPrimaryKey(Integer actionId);

    int updateByPrimaryKeySelective(RlActionRecord record);

    int updateByPrimaryKey(RlActionRecord record);
}