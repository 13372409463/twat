package com.ralei.dao.employeedao;

import com.ralei.pojo.SysEmployee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysEmployeeDao {
    /*查询所有人员列表*/
    List<SysEmployee> selectEmployeeUserList();

    /*添加员工*/
    Integer addEmployee(SysEmployee sysEmployee);

    /*修改员工基本信息*/
    Integer updateEmployeeByEmId(SysEmployee sysEmployee);

    /*删除员工*/
    Integer deleteEmployeeById(Integer emId);

    /*查询员工详情*/
    SysEmployee selectEmployeeById(Integer emId);

    /*按照姓名或联系方式搜索*/
    SysEmployee selectEmployeeByPhoneOrName(String emName,String emPhone);
}
