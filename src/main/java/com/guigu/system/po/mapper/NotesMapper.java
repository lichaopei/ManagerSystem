package com.guigu.system.po.mapper;

import com.guigu.system.po.Notes;
import com.guigu.system.po.NotesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotesMapper {
    int countByExample(NotesExample example);

    int deleteByExample(NotesExample example);

    int deleteByPrimaryKey(Integer noteId);

    int insert(Notes record);

    int insertSelective(Notes record);

    List<Notes> selectByExample(NotesExample example);

    Notes selectByPrimaryKey(Integer noteId);

    int updateByExampleSelective(@Param("record") Notes record, @Param("example") NotesExample example);

    int updateByExample(@Param("record") Notes record, @Param("example") NotesExample example);

    int updateByPrimaryKeySelective(Notes record);

    int updateByPrimaryKey(Notes record);
}