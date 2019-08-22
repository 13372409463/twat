package com.ralei.service;

import com.ralei.pojo.SysEmployee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SysEmployeeService {
    int deleteByPrimaryKey(Integer emId);

    int insert(SysEmployee record);

    int insertSelective(SysEmployee record);

    SysEmployee selectByPrimaryKey(Integer emId);

    int updateByPrimaryKeySelective(SysEmployee record);

    int updateByPrimaryKey(SysEmployee record);

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
