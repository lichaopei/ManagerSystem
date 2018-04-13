package com.guigu.system.po.mapper;

import com.guigu.system.po.TargetLevel;
import com.guigu.system.po.TargetLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TargetLevelMapper {
    int countByExample(TargetLevelExample example);

    int deleteByExample(TargetLevelExample example);

    int deleteByPrimaryKey(Integer levelId);

    int insert(TargetLevel record);

    int insertSelective(TargetLevel record);

    List<TargetLevel> selectByExample(TargetLevelExample example);

    TargetLevel selectByPrimaryKey(Integer levelId);

    int updateByExampleSelective(@Param("record") TargetLevel record, @Param("example") TargetLevelExample example);

    int updateByExample(@Param("record") TargetLevel record, @Param("example") TargetLevelExample example);

    int updateByPrimaryKeySelective(TargetLevel record);

    int updateByPrimaryKey(TargetLevel record);
}