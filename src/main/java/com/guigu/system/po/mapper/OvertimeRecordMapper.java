package com.guigu.system.po.mapper;

import com.guigu.system.po.OvertimeRecord;
import com.guigu.system.po.OvertimeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OvertimeRecordMapper {
    int countByExample(OvertimeRecordExample example);

    int deleteByExample(OvertimeRecordExample example);

    int deleteByPrimaryKey(Integer overtimeId);

    int insert(OvertimeRecord record);

    int insertSelective(OvertimeRecord record);

    List<OvertimeRecord> selectByExample(OvertimeRecordExample example);

    OvertimeRecord selectByPrimaryKey(Integer overtimeId);

    int updateByExampleSelective(@Param("record") OvertimeRecord record, @Param("example") OvertimeRecordExample example);

    int updateByExample(@Param("record") OvertimeRecord record, @Param("example") OvertimeRecordExample example);

    int updateByPrimaryKeySelective(OvertimeRecord record);

    int updateByPrimaryKey(OvertimeRecord record);
}