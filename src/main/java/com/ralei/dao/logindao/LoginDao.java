package com.ralei.dao.logindao;

import com.ralei.pojo.SysEmployee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {
    /*验证用户账号密码是否正确*/
    SysEmployee selectSysEmployeeByUsername(String username, String password);

    /*通过用户名查询用户*/
    SysEmployee selectEmployeeByEmPhone(String username);

    /*修改密码*/
    Integer updateEmployeeByEmPhone(String username, String password);

    /*验证密保答案*/
    String checkEmployeeAnswer(String username);
}
