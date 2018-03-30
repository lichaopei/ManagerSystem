package com.guigu.system.po.mapper;

import com.guigu.system.po.AdminPopedom;
import com.guigu.system.po.AdminPopedomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminPopedomMapper {
    int countByExample(AdminPopedomExample example);

    int deleteByExample(AdminPopedomExample example);

    int deleteByPrimaryKey(Integer popedomId);

    int insert(AdminPopedom record);

    int insertSelective(AdminPopedom record);

    List<AdminPopedom> selectByExample(AdminPopedomExample example);

    AdminPopedom selectByPrimaryKey(Integer popedomId);

    int updateByExampleSelective(@Param("record") AdminPopedom record, @Param("example") AdminPopedomExample example);

    int updateByExample(@Param("record") AdminPopedom record, @Param("example") AdminPopedomExample example);

    int updateByPrimaryKeySelective(AdminPopedom record);

    int updateByPrimaryKey(AdminPopedom record);
}