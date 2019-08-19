package com.woniu.mapper;

import com.woniu.entity.Credit;
import com.woniu.entity.CreditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditMapper {
    long countByExample(CreditExample example);

    int deleteByExample(CreditExample example);

    int deleteByPrimaryKey(Integer creditid);

    int insert(Credit record);

    int insertSelective(Credit record);

    List<Credit> selectByExample(CreditExample example);

    Credit selectByPrimaryKey(Integer creditid);

    int updateByExampleSelective(@Param("record") Credit record, @Param("example") CreditExample example);

    int updateByExample(@Param("record") Credit record, @Param("example") CreditExample example);

    int updateByPrimaryKeySelective(Credit record);

    int updateByPrimaryKey(Credit record);
}