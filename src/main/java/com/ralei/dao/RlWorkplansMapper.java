package com.ralei.dao;

import com.ralei.pojo.RlWorkplans;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RlWorkplansMapper {
    int deleteByPrimaryKey(Integer wpId);

    int insert(RlWorkplans record);

    int insertSelective(RlWorkplans record);

    RlWorkplans selectByPrimaryKey(Integer wpId);

    int updateByPrimaryKeySelective(RlWorkplans record);

    int updateByPrimaryKey(RlWorkplans record);
}