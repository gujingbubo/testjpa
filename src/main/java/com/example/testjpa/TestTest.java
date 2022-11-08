package com.example.testjpa;

import com.example.testjpa.dynamic.mapper.Mapper1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 33547
 * @version 1.0
 * @date 2022-11-08 15:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TestTest {

    @Resource(name = "mapper1")
    Mapper1 mapper1;

    @Test
    public void Test1(){
        List<Map> maps = mapper1.queryDate();

    }
}
