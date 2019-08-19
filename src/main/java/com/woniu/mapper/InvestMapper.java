package com.woniu.mapper;

import com.woniu.entity.Invest;
import com.woniu.entity.InvestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvestMapper {
    long countByExample(InvestExample example);

    int deleteByExample(InvestExample example);

    int deleteByPrimaryKey(Integer invertid);

    int insert(Invest record);

    int insertSelective(Invest record);

    List<Invest> selectByExample(InvestExample example);

    Invest selectByPrimaryKey(Integer invertid);

    int updateByExampleSelective(@Param("record") Invest record, @Param("example") InvestExample example);

    int updateByExample(@Param("record") Invest record, @Param("example") InvestExample example);

    int updateByPrimaryKeySelective(Invest record);

    int updateByPrimaryKey(Invest record);
}