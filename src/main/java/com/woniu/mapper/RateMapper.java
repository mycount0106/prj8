package com.woniu.mapper;

import com.woniu.entity.Rate;
import com.woniu.entity.RateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RateMapper {
	Double findLoanRate(Integer deadline);

    long countByExample(RateExample example);

    int deleteByExample(RateExample example);

    int deleteByPrimaryKey(Integer rateid);

    int insert(Rate record);

    int insertSelective(Rate record);

    List<Rate> selectByExample(RateExample example);

    Rate selectByPrimaryKey(Integer rateid);

    int updateByExampleSelective(@Param("record") Rate record, @Param("example") RateExample example);

    int updateByExample(@Param("record") Rate record, @Param("example") RateExample example);

    int updateByPrimaryKeySelective(Rate record);

    int updateByPrimaryKey(Rate record);
}