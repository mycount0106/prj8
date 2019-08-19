package com.woniu.mapper;

import com.woniu.entity.UserinvestExample;
import com.woniu.entity.UserinvestKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinvestMapper {
    long countByExample(UserinvestExample example);

    int deleteByExample(UserinvestExample example);

    int deleteByPrimaryKey(UserinvestKey key);

    int insert(UserinvestKey record);

    int insertSelective(UserinvestKey record);

    List<UserinvestKey> selectByExample(UserinvestExample example);

    int updateByExampleSelective(@Param("record") UserinvestKey record, @Param("example") UserinvestExample example);

    int updateByExample(@Param("record") UserinvestKey record, @Param("example") UserinvestExample example);
}