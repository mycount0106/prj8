package com.woniu.mapper;

import com.woniu.entity.Userdata;
import com.woniu.entity.UserdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserdataMapper {
    long countByExample(UserdataExample example);

    int deleteByExample(UserdataExample example);

    int deleteByPrimaryKey(Integer dataid);

    int insert(Userdata record);

    int insertSelective(Userdata record);

    List<Userdata> selectByExample(UserdataExample example);

    Userdata selectByPrimaryKey(Integer dataid);

    int updateByExampleSelective(@Param("record") Userdata record, @Param("example") UserdataExample example);

    int updateByExample(@Param("record") Userdata record, @Param("example") UserdataExample example);

    int updateByPrimaryKeySelective(Userdata record);

    int updateByPrimaryKey(Userdata record);
}