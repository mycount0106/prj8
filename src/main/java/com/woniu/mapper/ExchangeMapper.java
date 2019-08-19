package com.woniu.mapper;

import com.woniu.entity.Exchange;
import com.woniu.entity.ExchangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExchangeMapper {
    long countByExample(ExchangeExample example);

    int deleteByExample(ExchangeExample example);

    int deleteByPrimaryKey(Integer exchangeid);

    int insert(Exchange record);

    int insertSelective(Exchange record);

    List<Exchange> selectByExample(ExchangeExample example);

    Exchange selectByPrimaryKey(Integer exchangeid);

    int updateByExampleSelective(@Param("record") Exchange record, @Param("example") ExchangeExample example);

    int updateByExample(@Param("record") Exchange record, @Param("example") ExchangeExample example);

    int updateByPrimaryKeySelective(Exchange record);

    int updateByPrimaryKey(Exchange record);
}