package com.example.testjpa.dynamic.web;

import com.baomidou.dynamic.datasource.creator.DefaultDataSourceCreator;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DynamicDataSourceCreatorAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

/**
 * @author 33547
 * @version 1.0
 * @date 2022-11-08 17:03
 */
@RestController
public class testcontroller {



    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    DefaultDataSourceCreator DefaultDataSourceCreator;

    @GetMapping("/beanList")
     public List<String> beanList() {
      return Arrays.asList(applicationContext.getBeanDefinitionNames());
    }

    @Autowired
    DataSource dataSource;
    @GetMapping("/ttt")
    public String queryDate() throws SQLException {
        Connection connection = dataSource.getConnection();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from slave_table");
        return "123";
    }
}
