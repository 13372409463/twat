package com.ralei.service.ServiceImpl;

import com.ralei.dao.ratiodao.RatioDao;
import com.ralei.pojo.RlWorkplans;
import com.ralei.service.RatioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class RatioServiceImpl  implements RatioService{
    @Autowired
    private RatioDao  ratioDao;

    /*查询所有人员绩效,除领导,分页*/
    @Override
    public List<RlWorkplans> selectUserRatioList(String emName, Integer deptId, Date wpStarttime, Date wpEndtime) {
        return ratioDao.selectUserRatioList(emName,deptId,wpStarttime,wpEndtime);
    }
}
