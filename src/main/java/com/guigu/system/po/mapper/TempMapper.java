package com.guigu.system.po.mapper;

import com.guigu.system.po.Temp;
import com.guigu.system.po.TempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempMapper {
    int countByExample(TempExample example);

    int deleteByExample(TempExample example);

    int deleteByPrimaryKey(Integer tempId);

    int insert(Temp record);

    int insertSelective(Temp record);

    List<Temp> selectByExample(TempExample example);

    Temp selectByPrimaryKey(Integer tempId);

    int updateByExampleSelective(@Param("record") Temp record, @Param("example") TempExample example);

    int updateByExample(@Param("record") Temp record, @Param("example") TempExample example);

    int updateByPrimaryKeySelective(Temp record);

    int updateByPrimaryKey(Temp record);
}