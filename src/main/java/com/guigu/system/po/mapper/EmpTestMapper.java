package com.guigu.system.po.mapper;

import com.guigu.system.po.EmpTest;
import com.guigu.system.po.EmpTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpTestMapper {
    int countByExample(EmpTestExample example);

    int deleteByExample(EmpTestExample example);

    int deleteByPrimaryKey(Integer testId);

    int insert(EmpTest record);

    int insertSelective(EmpTest record);

    List<EmpTest> selectByExample(EmpTestExample example);

    EmpTest selectByPrimaryKey(Integer testId);

    int updateByExampleSelective(@Param("record") EmpTest record, @Param("example") EmpTestExample example);

    int updateByExample(@Param("record") EmpTest record, @Param("example") EmpTestExample example);

    int updateByPrimaryKeySelective(EmpTest record);

    int updateByPrimaryKey(EmpTest record);
}