package com.guigu.system.po.mapper;

import com.guigu.system.po.TargetRecord;
import com.guigu.system.po.TargetRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TargetRecordMapper {
    int countByExample(TargetRecordExample example);

    int deleteByExample(TargetRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(TargetRecord record);

    int insertSelective(TargetRecord record);

    List<TargetRecord> selectByExample(TargetRecordExample example);

    TargetRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") TargetRecord record, @Param("example") TargetRecordExample example);

    int updateByExample(@Param("record") TargetRecord record, @Param("example") TargetRecordExample example);

    int updateByPrimaryKeySelective(TargetRecord record);

    int updateByPrimaryKey(TargetRecord record);
}