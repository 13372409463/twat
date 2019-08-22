package com.ralei.controller.login.ratio;

import com.ralei.pojo.RlWorkplans;
import com.ralei.service.RatioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * @ClassName
 * @Description 效率统计
 * @Author
 * @Date 2019/8/14 11:41
 * @Version 1.0
 **/
@Controller
@RequestMapping("/ratio")
public class RatioController {

         @Autowired
         private RatioService ratioService;
         /*查询所有人员绩效,除领导,分页*/
         @RequestMapping("/selectUserRatioList")
         public  String selectUserRatioList(@RequestParam String emName, @RequestParam Integer deptId, @RequestParam Date wpStarttime,@RequestParam Date wpEndtime){
             List<RlWorkplans> rlWorkplansList=ratioService.selectUserRatioList(emName,deptId,wpStarttime,wpEndtime);
             return null;
         }
}
