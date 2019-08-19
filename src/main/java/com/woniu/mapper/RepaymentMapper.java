package com.woniu.mapper;

import com.woniu.entity.Repayment;
import com.woniu.entity.RepaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepaymentMapper {
    long countByExample(RepaymentExample example);

    int deleteByExample(RepaymentExample example);

    int deleteByPrimaryKey(Integer repayid);

    int insert(Repayment record);

    int insertSelective(Repayment record);

    List<Repayment> selectByExample(RepaymentExample example);

    Repayment selectByPrimaryKey(Integer repayid);

    int updateByExampleSelective(@Param("record") Repayment record, @Param("example") RepaymentExample example);

    int updateByExample(@Param("record") Repayment record, @Param("example") RepaymentExample example);

    int updateByPrimaryKeySelective(Repayment record);

    int updateByPrimaryKey(Repayment record);
}