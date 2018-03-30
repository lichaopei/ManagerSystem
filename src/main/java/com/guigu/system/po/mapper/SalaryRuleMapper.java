package com.guigu.system.po.mapper;

import com.guigu.system.po.SalaryRule;
import com.guigu.system.po.SalaryRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryRuleMapper {
    int countByExample(SalaryRuleExample example);

    int deleteByExample(SalaryRuleExample example);

    int deleteByPrimaryKey(Integer salaryId);

    int insert(SalaryRule record);

    int insertSelective(SalaryRule record);

    List<SalaryRule> selectByExample(SalaryRuleExample example);

    SalaryRule selectByPrimaryKey(Integer salaryId);

    int updateByExampleSelective(@Param("record") SalaryRule record, @Param("example") SalaryRuleExample example);

    int updateByExample(@Param("record") SalaryRule record, @Param("example") SalaryRuleExample example);

    int updateByPrimaryKeySelective(SalaryRule record);

    int updateByPrimaryKey(SalaryRule record);
}