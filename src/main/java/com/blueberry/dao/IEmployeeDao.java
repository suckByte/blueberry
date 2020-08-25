package com.blueberry.dao;

import java.util.List;

import com.blueberry.pojo.Employee;

public interface IEmployeeDao {
    int deleteByPrimaryKey(Integer empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer empId);
    
    Employee selectByPrimaryKeyWithDept(Integer empId);
    
    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}