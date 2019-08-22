package com.ralei.controller.login.personal;

import com.ralei.pojo.SysEmployee;
import com.ralei.service.PersonalService;
import com.ralei.service.SysEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personal")
public class PersonalController {

    @Autowired
    private PersonalService personalService;
    @Autowired
    private SysEmployeeService sysEmployeeService;
    /**
     * @Author xfx
     * @Date 16:50 2019/8/13
     * @Param [emId]
     * @return java.lang.String
     * 个人中心查看详情
     **/

    @RequestMapping("/personal")
    public String selectEmployeeByEmid(Integer emId){
        SysEmployee  sysEmployee=sysEmployeeService.selectEmployeeById(emId);
        return null;
    }

    /**
     * @Author xfx
     * @Date 16:50 2019/8/13
     * @Param
     * @return
     * 修改个人信息或者联系方式
     **/
    @RequestMapping("/updateEmployeeByEmId")
    public String updateEmployeeByEmId(SysEmployee sysEmployee){
        Integer  result=sysEmployeeService.updateEmployeeByEmId(sysEmployee);
        return null;
    }
}
