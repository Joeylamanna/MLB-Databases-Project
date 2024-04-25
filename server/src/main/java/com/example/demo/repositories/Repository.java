package com.example.demo.repositories;

import java.util.ArrayList;
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

    public List<?> get(String query, String table) {
        if (table.equals("Coach")) {
            return jdbcTemplate.query(query, new BeanPropertyRowMapper(Coach.class));
        }
        else if (table.equals("General_Manager")) {
            return jdbcTemplate.query(query, new BeanPropertyRowMapper(General_Manager.class));
        }
        else if (table.equals("Owner")) {
            return jdbcTemplate.query(query, new BeanPropertyRowMapper(Owner.class));
        }
        else if (table.equals("Player")) {
            return jdbcTemplate.query(query, new BeanPropertyRowMapper(Player.class));
        }
        else if (table.equals("Hitter")) {
            return jdbcTemplate.query(query, new BeanPropertyRowMapper(Hitter.class));
        }
        else if (table.equals("Pitcher")) {
            return jdbcTemplate.query(query, new BeanPropertyRowMapper(Pitcher.class));
        }
        else if (table.equals("PlayerJoinHitter")) {
            return jdbcTemplate.query(query, new BeanPropertyRowMapper(PlayerJoinHitter.class));
        }
        else if (table.equals("PlayerJoinPitcher")) {
            return jdbcTemplate.query(query, new BeanPropertyRowMapper(PlayerJoinPitcher.class));
        }
        return new ArrayList<>();
    }

    public void update(String query) {
        jdbcTemplate.update(query);
    }

    public void create(String query) {
        jdbcTemplate.update(query);
    }
}
