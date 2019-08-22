package com.ralei.service;

import com.ralei.pojo.RlWorkplans;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface RatioService{
    /*查询所有人员绩效,除领导,分页*/
    List<RlWorkplans> selectUserRatioList(String emName, Integer deptId, Date wpStarttime, Date wpEndtime);
}
