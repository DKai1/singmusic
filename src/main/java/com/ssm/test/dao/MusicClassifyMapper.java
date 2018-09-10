package com.ssm.test.dao;

import com.ssm.test.model.MusicClassify;
import com.ssm.test.model.MusicClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusicClassifyMapper {
    int countByExample(MusicClassifyExample example);

    int deleteByExample(MusicClassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MusicClassify record);

    int insertSelective(MusicClassify record);

    List<MusicClassify> selectByExample(MusicClassifyExample example);

    MusicClassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MusicClassify record, @Param("example") MusicClassifyExample example);

    int updateByExample(@Param("record") MusicClassify record, @Param("example") MusicClassifyExample example);

    int updateByPrimaryKeySelective(MusicClassify record);

    int updateByPrimaryKey(MusicClassify record);
}