package com.example.demo.models;

import org.springframework.data.annotation.Id;

public class Player {
    @Id
    Integer player_id;
    String first_name;
    String last_name;
    String salary;
    String position;
    Integer games_played;
    Integer jersey_number;
    String team;


    public Player() {
    }


    public Player(Integer player_id) {
        this.player_id = player_id;
    }

    public Integer getPlayer_id() {
        return this.player_id;
    }

    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSalary() {
        return this.salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getGames_played() {
        return this.games_played;
    }

    public void setGames_played(Integer games_played) {
        this.games_played = games_played;
    }

    public Integer getJersey_number() {
        return this.jersey_number;
    }

    public void setJersey_number(Integer jersey_number) {
        this.jersey_number = jersey_number;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
