package com.ralei.dao.performancedao;

import com.ralei.pojo.RlWorkplans;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PerformanceDao {
    /*个人绩效查询*/
    List<RlWorkplans> selectPerformanceList(Integer emId);
}
