package com.woniu.mapper;

import com.woniu.entity.Userticket;
import com.woniu.entity.UserticketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserticketMapper {
    long countByExample(UserticketExample example);

    int deleteByExample(UserticketExample example);

    int deleteByPrimaryKey(Integer userticketid);

    int insert(Userticket record);

    int insertSelective(Userticket record);

    List<Userticket> selectByExample(UserticketExample example);

    Userticket selectByPrimaryKey(Integer userticketid);

    int updateByExampleSelective(@Param("record") Userticket record, @Param("example") UserticketExample example);

    int updateByExample(@Param("record") Userticket record, @Param("example") UserticketExample example);

    int updateByPrimaryKeySelective(Userticket record);

    int updateByPrimaryKey(Userticket record);
}