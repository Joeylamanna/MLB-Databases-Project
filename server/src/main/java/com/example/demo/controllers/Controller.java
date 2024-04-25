package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositories.Repository;

@RestController
@CrossOrigin(origins="http://localhost:3000", maxAge = 3600)
public class Controller {
    @Autowired
    Repository repository;
    
    @GetMapping("/")
    public List<?> getInfo(@RequestParam(name="query")String query, @RequestParam(name="table")String table) {
        return repository.get(query, table);
    } 

    @PutMapping("/")
    public void update(@RequestParam(name="query")String query) {
        repository.update(query);
    }

    @PostMapping("/")
    public void create(@RequestParam(name="query")String query) {
        repository.create(query);
    }
}
