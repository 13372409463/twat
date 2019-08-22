package com.ralei.service.ServiceImpl;

import com.ralei.dao.employeedao.SysEmployeeDao;
import com.ralei.pojo.SysEmployee;
import com.ralei.service.SysEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SysEmployeeServiceImpl  implements SysEmployeeService{
   @Autowired
   private SysEmployeeDao  sysEmployeeDao;
    @Override
    public int deleteByPrimaryKey(Integer emId) {
        return 0;
    }

    @Override
    public int insert(SysEmployee record) {
        return 0;
    }

    @Override
    public int insertSelective(SysEmployee record) {
        return 0;
    }

    @Override
    public SysEmployee selectByPrimaryKey(Integer emId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysEmployee record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysEmployee record) {
        return 0;
    }

    /*查询所有人员列表*/
    @Override
    public List<SysEmployee> selectEmployeeUserList() {
        return sysEmployeeDao.selectEmployeeUserList();
    }

    /*添加员工*/
    @Override
    public Integer addEmployee(SysEmployee sysEmployee) {
        return sysEmployeeDao.addEmployee(sysEmployee);
    }

    /*修改员工基本信息*/
    @Override
    public Integer updateEmployeeByEmId(SysEmployee sysEmployee) {
        return sysEmployeeDao.updateEmployeeByEmId(sysEmployee);
    }

    /*删除员工基本信息*/
    @Override
    public Integer deleteEmployeeById(Integer emId) {
        return sysEmployeeDao.deleteEmployeeById(emId);
    }

    /*查询员工详情*/
    @Override
    public SysEmployee selectEmployeeById(Integer emId) {
        return sysEmployeeDao.selectEmployeeById(emId);
    }

    /*按照姓名或者联系方式搜索*/
    @Override
    public SysEmployee selectEmployeeByPhoneOrName(String emName, String emPhone) {
        return sysEmployeeDao.selectEmployeeByPhoneOrName(emName,emPhone);
    }
}
