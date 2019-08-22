package com.ralei.service.ServiceImpl;


import com.ralei.dao.logindao.LoginDao;
import com.ralei.pojo.SysEmployee;
import com.ralei.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDao loginDao;

    @Override
    public SysEmployee selectSysEmployeeByUsername(String username, String password) {
        SysEmployee sysEmployee=loginDao.selectSysEmployeeByUsername(username,password);
        if(sysEmployee!=null){
            return sysEmployee;
        }else{
            return null;
        }
    }
    /*通过用户名查询用户*/
    @Override
    public SysEmployee selectEmployeeByEmPhone(String username) {
        SysEmployee sysEmployee = loginDao.selectEmployeeByEmPhone(username);
        if (sysEmployee != null) {
            return sysEmployee;
        }
        return null;
    }

    /*修改密码*/
    @Override
    public Integer updateEmployeeByEmPhone(String username, String password) {
        return loginDao.updateEmployeeByEmPhone(username,password);
    }
    /*验证密保答案*/
    @Override
    public String checkEmployeeAnswer(String username) {
        return loginDao.checkEmployeeAnswer(username);
    }
}
