package com.woniu.mapper;

import com.woniu.entity.Loan;
import com.woniu.entity.LoanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanMapper {
    long countByExample(LoanExample example);

    int deleteByExample(LoanExample example);

    int deleteByPrimaryKey(Integer loanid);

    int insert(Loan record);

    int insertSelective(Loan record);

    List<Loan> selectByExample(LoanExample example);

    Loan selectByPrimaryKey(Integer loanid);

    int updateByExampleSelective(@Param("record") Loan record, @Param("example") LoanExample example);

    int updateByExample(@Param("record") Loan record, @Param("example") LoanExample example);

    int updateByPrimaryKeySelective(Loan record);

    int updateByPrimaryKey(Loan record);
}