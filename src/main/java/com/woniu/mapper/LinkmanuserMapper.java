package com.woniu.mapper;

import com.woniu.entity.LinkmanuserExample;
import com.woniu.entity.LinkmanuserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkmanuserMapper {
    long countByExample(LinkmanuserExample example);

    int deleteByExample(LinkmanuserExample example);

    int deleteByPrimaryKey(LinkmanuserKey key);

    int insert(LinkmanuserKey record);

    int insertSelective(LinkmanuserKey record);

    List<LinkmanuserKey> selectByExample(LinkmanuserExample example);

    int updateByExampleSelective(@Param("record") LinkmanuserKey record, @Param("example") LinkmanuserExample example);

    int updateByExample(@Param("record") LinkmanuserKey record, @Param("example") LinkmanuserExample example);
}