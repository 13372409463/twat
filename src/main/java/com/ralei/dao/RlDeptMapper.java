package com.ralei.dao;

import com.ralei.pojo.RlDept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RlDeptMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(RlDept record);

    int insertSelective(RlDept record);

    RlDept selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(RlDept record);

    int updateByPrimaryKey(RlDept record);
}