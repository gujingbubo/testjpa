package com.example.testjpa.dynamic.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author 33547
 * @version 1.0
 * @date 2022-11-08 15:03
 */

@Mapper
@DS("slave")
public interface Mapper2 {

    @Select("select * from slave_table")
    List<Map> queryDate();
}
