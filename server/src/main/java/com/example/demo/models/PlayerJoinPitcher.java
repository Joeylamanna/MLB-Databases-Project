package com.example.demo.models;

import org.springframework.data.annotation.Id;

public class PlayerJoinPitcher {
    @Id
    Integer player_id;
    String first_name;
    String last_name;
    String salary;
    String position;
    Integer games_played;
    Integer jersey_number;
    String team;
    Integer innings_pitched;
    Integer wins;
    Integer games_started;
    Integer earned_runs;
    double whip;
    Integer strikeouts;
    Integer saves;
    Integer walks;
    Integer losses;
    Integer runs;
    Integer shutouts;
    Integer hits;
    Integer homeruns;
    double era;
    double h9;
    double hr9;
    double bb9;
    double so9;
    double so_per_walk;
    double fip;
    Integer wild_pitches;
    Integer balks;
    Integer hbp;
    

    public PlayerJoinPitcher() {
    }    
    public PlayerJoinPitcher(Integer player_id) {
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

    public Integer getInnings_pitched() {
        return this.innings_pitched;
    }

    public void setInnings_pitched(Integer innings_pitched) {
        this.innings_pitched = innings_pitched;
    }

    public Integer getWins() {
        return this.wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getGames_started() {
        return this.games_started;
    }

    public void setGames_started(Integer games_started) {
        this.games_started = games_started;
    }

    public Integer getEarned_runs() {
        return this.earned_runs;
    }

    public void setEarned_runs(Integer earned_runs) {
        this.earned_runs = earned_runs;
    }

    public double getWhip() {
        return this.whip;
    }

    public void setWhip(double whip) {
        this.whip = whip;
    }

    public Integer getStrikeouts() {
        return this.strikeouts;
    }

    public void setStrikeouts(Integer strikeouts) {
        this.strikeouts = strikeouts;
    }

    public Integer getSaves() {
        return this.saves;
    }

    public void setSaves(Integer saves) {
        this.saves = saves;
    }

    public Integer getWalks() {
        return this.walks;
    }

    public void setWalks(Integer walks) {
        this.walks = walks;
    }

    public Integer getLosses() {
        return this.losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getRuns() {
        return this.runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Integer getShutouts() {
        return this.shutouts;
    }

    public void setShutouts(Integer shutouts) {
        this.shutouts = shutouts;
    }

    public Integer getHits() {
        return this.hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getHomeruns() {
        return this.homeruns;
    }

    public void setHomeruns(Integer homeruns) {
        this.homeruns = homeruns;
    }

    public double getEra() {
        return this.era;
    }

    public void setEra(double era) {
        this.era = era;
    }

    public double getH9() {
        return this.h9;
    }

    public void setH9(double h9) {
        this.h9 = h9;
    }

    public double getHr9() {
        return this.hr9;
    }

    public void setHr9(double hr9) {
        this.hr9 = hr9;
    }

    public double getBb9() {
        return this.bb9;
    }

    public void setBb9(double bb9) {
        this.bb9 = bb9;
    }

    public double getSo9() {
        return this.so9;
    }

    public void setSo9(double so9) {
        this.so9 = so9;
    }

    public double getSo_per_walk() {
        return this.so_per_walk;
    }

    public void setSo_per_walk(double so_per_walk) {
        this.so_per_walk = so_per_walk;
    }

    public double getFip() {
        return this.fip;
    }

    public void setFip(double fip) {
        this.fip = fip;
    }

    public Integer getWild_pitches() {
        return this.wild_pitches;
    }

    public void setWild_pitches(Integer wild_pitches) {
        this.wild_pitches = wild_pitches;
    }

    public Integer getBalks() {
        return this.balks;
    }

    public void setBalks(Integer balks) {
        this.balks = balks;
    }

    public Integer getHbp() {
        return this.hbp;
    }

    public void setHbp(Integer hbp) {
        this.hbp = hbp;
    }
}
