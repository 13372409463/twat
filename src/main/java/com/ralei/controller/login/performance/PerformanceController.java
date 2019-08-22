package com.ralei.controller.login.performance;

import com.ralei.dao.performancedao.PerformanceDao;
import com.ralei.pojo.RlWorkplans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
/**
 * @Author xfx
 * @Date 9:38 2019/8/21
 * @Param
 * @return
 * 我的绩效
 **/
@Controller
@RequestMapping("/performance")
public class PerformanceController {

    @Autowired
    private PerformanceDao PerformanceDao;

    @RequestMapping("/performance")
    public  String selectPerformanceList(Integer emId){
        //个人绩效查询
        List<RlWorkplans> rlWorkplansList=PerformanceDao.selectPerformanceList(emId);
        return null;
    }
}
