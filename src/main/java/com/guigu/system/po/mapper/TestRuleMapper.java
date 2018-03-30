package com.guigu.system.po.mapper;

import com.guigu.system.po.TestRule;
import com.guigu.system.po.TestRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestRuleMapper {
    int countByExample(TestRuleExample example);

    int deleteByExample(TestRuleExample example);

    int deleteByPrimaryKey(Integer ruleId);

    int insert(TestRule record);

    int insertSelective(TestRule record);

    List<TestRule> selectByExample(TestRuleExample example);

    TestRule selectByPrimaryKey(Integer ruleId);

    int updateByExampleSelective(@Param("record") TestRule record, @Param("example") TestRuleExample example);

    int updateByExample(@Param("record") TestRule record, @Param("example") TestRuleExample example);

    int updateByPrimaryKeySelective(TestRule record);

    int updateByPrimaryKey(TestRule record);
}