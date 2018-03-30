package com.guigu.system.po.mapper;

import com.guigu.system.po.AttendanceRule;
import com.guigu.system.po.AttendanceRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendanceRuleMapper {
    int countByExample(AttendanceRuleExample example);

    int deleteByExample(AttendanceRuleExample example);

    int deleteByPrimaryKey(Integer ruleId);

    int insert(AttendanceRule record);

    int insertSelective(AttendanceRule record);

    List<AttendanceRule> selectByExample(AttendanceRuleExample example);

    AttendanceRule selectByPrimaryKey(Integer ruleId);

    int updateByExampleSelective(@Param("record") AttendanceRule record, @Param("example") AttendanceRuleExample example);

    int updateByExample(@Param("record") AttendanceRule record, @Param("example") AttendanceRuleExample example);

    int updateByPrimaryKeySelective(AttendanceRule record);

    int updateByPrimaryKey(AttendanceRule record);
}