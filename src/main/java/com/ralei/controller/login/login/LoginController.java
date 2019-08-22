package com.ralei.controller.login.login;

import com.ralei.pojo.SysEmployee;
import com.ralei.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired(required = false)
    private LoginService loginService;

    /**
     * @Author xfx
     * @Date 9:01 2019/8/15
     * @Param [username, password]
     * 用户登录
     **/
    @RequestMapping(value = "/userLogin")
    public String userLogin(@RequestParam("username") String username, @RequestParam("password") String password){
        SysEmployee sysEmployee=loginService.selectSysEmployeeByUsername(username,password);
        if(sysEmployee!=null){
            return "login";
        }
        return  null;
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    /**
     * @Author xfx
     * @Param [username]
     * 通过用户名查询用户
     **/
    @RequestMapping("/selectEmployeeByEmPhone")
    public String selectEmployeeByEmPhone(@RequestParam("username") String username){
        SysEmployee sysEmployee=loginService.selectEmployeeByEmPhone(username);
        if(sysEmployee!=null){
            return "login";
        }
        return null;
    }

    /**
     * @Author xfx
     * @Date 14:39 2019/8/13
     * @Param
     * 验证密保问题
     * @return
     **/
    @RequestMapping("/checkEmployeeAnswer")
    public String checkEmployeeAnswer(@RequestParam("username") String username,@RequestParam("EmAnswer") String emAnswer){
        String result=loginService.checkEmployeeAnswer(username);
        if(emAnswer.equals(result)){
            return "login";//密保答案正确,才能修改密码
        }
           return null;
    }

    /**
     * @Author xfx
     * @Date 14:21 2019/8/13
     * @Param  修改密码,密保答案正确,才能修改密码
     * @return
     **/
    @RequestMapping("/selectEmployeeByEmPhone")
    public String updateEmployeeByEmPhone(@RequestParam("username") String username,@RequestParam("password") String password){
        Integer result=loginService.updateEmployeeByEmPhone(username,password);//事务
        if(result!=null&&result!=0){
            return "login";
        }
        return null;
    }
}
