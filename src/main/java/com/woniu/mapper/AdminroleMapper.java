package com.woniu.mapper;

import com.woniu.entity.AdminroleExample;
import com.woniu.entity.AdminroleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminroleMapper {
    long countByExample(AdminroleExample example);

    int deleteByExample(AdminroleExample example);

    int deleteByPrimaryKey(AdminroleKey key);

    int insert(AdminroleKey record);

    int insertSelective(AdminroleKey record);

    List<AdminroleKey> selectByExample(AdminroleExample example);

    int updateByExampleSelective(@Param("record") AdminroleKey record, @Param("example") AdminroleExample example);

    int updateByExample(@Param("record") AdminroleKey record, @Param("example") AdminroleExample example);
}