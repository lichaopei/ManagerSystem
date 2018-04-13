package com.guigu.system.po.mapper;

import com.guigu.system.po.Target;
import com.guigu.system.po.TargetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TargetMapper {
    int countByExample(TargetExample example);

    int deleteByExample(TargetExample example);

    int deleteByPrimaryKey(Integer targetId);

    int insert(Target record);

    int insertSelective(Target record);

    List<Target> selectByExample(TargetExample example);

    Target selectByPrimaryKey(Integer targetId);

    int updateByExampleSelective(@Param("record") Target record, @Param("example") TargetExample example);

    int updateByExample(@Param("record") Target record, @Param("example") TargetExample example);

    int updateByPrimaryKeySelective(Target record);

    int updateByPrimaryKey(Target record);
}