package com.guigu.system.po.mapper;

import com.guigu.system.po.PhotoType;
import com.guigu.system.po.PhotoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhotoTypeMapper {
    int countByExample(PhotoTypeExample example);

    int deleteByExample(PhotoTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(PhotoType record);

    int insertSelective(PhotoType record);

    List<PhotoType> selectByExample(PhotoTypeExample example);

    PhotoType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") PhotoType record, @Param("example") PhotoTypeExample example);

    int updateByExample(@Param("record") PhotoType record, @Param("example") PhotoTypeExample example);

    int updateByPrimaryKeySelective(PhotoType record);

    int updateByPrimaryKey(PhotoType record);
}