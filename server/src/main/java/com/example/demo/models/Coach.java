package com.example.demo.models;

import org.springframework.data.annotation.Id;

public class Coach {
    @Id
    String full_name;
    String position;
    Integer wins;
    Integer losses;
    String salary;
    String team;

    public Coach() {

    }
    public Coach(String full_name) {
        this.full_name = full_name;
    }

    public String getFull_name() {
        return this.full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getWins() {
        return this.wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return this.losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public String getSalary() {
        return this.salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}