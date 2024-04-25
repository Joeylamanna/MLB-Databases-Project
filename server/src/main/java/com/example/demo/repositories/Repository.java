package com.example.demo.repositories;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.example.demo.models.*;

@Component
public class Repository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<?> get(String query) {
        return jdbcTemplate.query(query, new BeanPropertyRowMapper(AllData.class));
    }

    public void update(String query) {
        jdbcTemplate.update(query);
    }

    public void create(String query) {
        jdbcTemplate.update(query);
    }
}
