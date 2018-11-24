package com.demo.springdatajdbcdemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import java.sql.ResultSet
import java.sql.SQLException

@RestController
class DataController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/data")
    List<String> data(){

        return jdbcTemplate.query('select resource_name from st_biz_managed_resource limit 25',
                new RowMapper<String>() {
                    @Override
                    String mapRow(ResultSet rs, int rowNum) throws SQLException {
                        rs.getString('resource_name')
                    }
                })
    }
}
