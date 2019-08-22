package com.ralei.dao;

import com.ralei.pojo.SysEmployee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysEmployeeMapper {
    int deleteByPrimaryKey(Integer emId);

    int insert(SysEmployee record);

    int insertSelective(SysEmployee record);

    SysEmployee selectByPrimaryKey(Integer emId);

    int updateByPrimaryKeySelective(SysEmployee record);

    int updateByPrimaryKey(SysEmployee record);

}