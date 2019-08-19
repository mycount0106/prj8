package com.woniu.mapper;

import com.woniu.entity.Withdrawal;
import com.woniu.entity.WithdrawalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WithdrawalMapper {
    long countByExample(WithdrawalExample example);

    int deleteByExample(WithdrawalExample example);

    int deleteByPrimaryKey(Integer drawid);

    int insert(Withdrawal record);

    int insertSelective(Withdrawal record);

    List<Withdrawal> selectByExample(WithdrawalExample example);

    Withdrawal selectByPrimaryKey(Integer drawid);

    int updateByExampleSelective(@Param("record") Withdrawal record, @Param("example") WithdrawalExample example);

    int updateByExample(@Param("record") Withdrawal record, @Param("example") WithdrawalExample example);

    int updateByPrimaryKeySelective(Withdrawal record);

    int updateByPrimaryKey(Withdrawal record);
}