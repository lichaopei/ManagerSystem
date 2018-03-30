package com.guigu.system.po.mapper;

import com.guigu.system.po.IndexLevel;
import com.guigu.system.po.IndexLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexLevelMapper {
    int countByExample(IndexLevelExample example);

    int deleteByExample(IndexLevelExample example);

    int deleteByPrimaryKey(Integer targetId);

    int insert(IndexLevel record);

    int insertSelective(IndexLevel record);

    List<IndexLevel> selectByExample(IndexLevelExample example);

    IndexLevel selectByPrimaryKey(Integer targetId);

    int updateByExampleSelective(@Param("record") IndexLevel record, @Param("example") IndexLevelExample example);

    int updateByExample(@Param("record") IndexLevel record, @Param("example") IndexLevelExample example);

    int updateByPrimaryKeySelective(IndexLevel record);

    int updateByPrimaryKey(IndexLevel record);
}