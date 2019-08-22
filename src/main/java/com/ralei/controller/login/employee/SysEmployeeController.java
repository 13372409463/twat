package com.ralei.controller.login.employee;

import com.ralei.pojo.SysEmployee;
import com.ralei.service.SysEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/employee")
public class SysEmployeeController {

    @Autowired
    private SysEmployeeService sysEmployeeService;

    /**
     * @Author xfx
     * @Date 15:17 2019/8/13
     * @Param
     * @return
     * 查询员工列表
     **/
    @RequestMapping("/selectEmployeeUserList")
    public String selectEmployeeUserList(){
        List<SysEmployee> sysEmployeeList=sysEmployeeService.selectEmployeeUserList();
        return null;
    }

    /**
     * @Author xfx
     * @Date 15:38 2019/8/13
     * @Param
     * 添加员工
     * @return
     **/
    @RequestMapping("/addEmployee")
    public String addEmployee(SysEmployee sysEmployee){
        Integer result=sysEmployeeService.addEmployee(sysEmployee);
        return  null;
    }

    /**
     * @Author xfx
     * @Date 15:49 2019/8/13
     * @Param
     * @return
     * 修改员工基本信息
     **/
    @RequestMapping("/updateEmployeeByEmId")
    public String updateEmployeeByEmId(SysEmployee sysEmployee){
        Integer result=sysEmployeeService.updateEmployeeByEmId(sysEmployee);
        return  null;
    }

    /**
     * @Author xfx
     * @Date 15:57 2019/8/13
     * @Param
     * @return
     * 删除员工
     **/
    @RequestMapping("/deleteEmployeeById")
    public String deleteEmployeeById(Integer emId){
        Integer result=sysEmployeeService.deleteEmployeeById(emId);
        return  null;
    }

    /**
     * @Author xfx
     * @Date 16:01 2019/8/13
     * @Param
     * @return
     * 查询员工详情
     **/
    @RequestMapping("/selectEmployeeById")
    public String selectEmployeeById(Integer emId){
        SysEmployee  sysEmployee=sysEmployeeService.selectEmployeeById(emId);
        return  null;
    }

    /**
     * @Author xfx
     * @Date 16:11 2019/8/13
     * @Param
     * @return
     * 按照姓名搜索或者按照联系方式搜索
     **/

    @RequestMapping("/selectEmployeeByPhoneOrName")
    public String selectEmployeeByPhoneOrName(String emName,String emPhone){
        SysEmployee  sysEmployee=sysEmployeeService.selectEmployeeByPhoneOrName(emName,emPhone);
        return  null;
    }
}
