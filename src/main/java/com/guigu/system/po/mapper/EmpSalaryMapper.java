package com.guigu.system.po.mapper;

import com.guigu.system.po.EmpSalary;
import com.guigu.system.po.EmpSalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpSalaryMapper {
    int countByExample(EmpSalaryExample example);

    int deleteByExample(EmpSalaryExample example);

    int deleteByPrimaryKey(Integer salaryId);

    int insert(EmpSalary record);

    int insertSelective(EmpSalary record);

    List<EmpSalary> selectByExample(EmpSalaryExample example);

    EmpSalary selectByPrimaryKey(Integer salaryId);

    int updateByExampleSelective(@Param("record") EmpSalary record, @Param("example") EmpSalaryExample example);

    int updateByExample(@Param("record") EmpSalary record, @Param("example") EmpSalaryExample example);

    int updateByPrimaryKeySelective(EmpSalary record);

    int updateByPrimaryKey(EmpSalary record);
}