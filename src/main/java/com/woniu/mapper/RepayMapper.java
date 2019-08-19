package com.woniu.mapper;

import com.woniu.entity.Repay;
import com.woniu.entity.RepayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepayMapper {
    long countByExample(RepayExample example);

    int deleteByExample(RepayExample example);

    int deleteByPrimaryKey(Integer repayid);

    int insert(Repay record);

    int insertSelective(Repay record);

    List<Repay> selectByExample(RepayExample example);

    Repay selectByPrimaryKey(Integer repayid);

    int updateByExampleSelective(@Param("record") Repay record, @Param("example") RepayExample example);

    int updateByExample(@Param("record") Repay record, @Param("example") RepayExample example);

    int updateByPrimaryKeySelective(Repay record);

    int updateByPrimaryKey(Repay record);
}