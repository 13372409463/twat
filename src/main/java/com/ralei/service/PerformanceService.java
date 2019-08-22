package com.ralei.service;

import com.ralei.pojo.RlWorkplans;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PerformanceService {

    /*个人绩效查询*/
    List<RlWorkplans> selectPerformanceList(Integer emId);
}
