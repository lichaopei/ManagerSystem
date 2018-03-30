package com.guigu.system.po.mapper;

import com.guigu.system.po.AttendanceType;
import com.guigu.system.po.AttendanceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendanceTypeMapper {
    int countByExample(AttendanceTypeExample example);

    int deleteByExample(AttendanceTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(AttendanceType record);

    int insertSelective(AttendanceType record);

    List<AttendanceType> selectByExample(AttendanceTypeExample example);

    AttendanceType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") AttendanceType record, @Param("example") AttendanceTypeExample example);

    int updateByExample(@Param("record") AttendanceType record, @Param("example") AttendanceTypeExample example);

    int updateByPrimaryKeySelective(AttendanceType record);

    int updateByPrimaryKey(AttendanceType record);
}