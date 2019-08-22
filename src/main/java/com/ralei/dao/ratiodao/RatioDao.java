package com.ralei.dao.ratiodao;

import com.ralei.pojo.RlWorkplans;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface RatioDao {

    /*查询所有人员绩效,除领导,分页*/
    List<RlWorkplans> selectUserRatioList(String emName, Integer deptId, Date wpStarttime, Date wpEndtime);
}
