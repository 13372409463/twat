package com.ralei.service.ServiceImpl;


import com.ralei.dao.performancedao.PerformanceDao;
import com.ralei.pojo.RlWorkplans;
import com.ralei.service.PerformanceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PerformanceServiceImpl implements PerformanceService {
    @Autowired
    private PerformanceDao performanceDao;
    /*个人绩效查询*/
    @Override
    public List<RlWorkplans> selectPerformanceList(Integer emId) {
        return performanceDao.selectPerformanceList(emId);
    }
}
