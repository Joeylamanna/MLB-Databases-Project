package com.example.demo.models;

import org.springframework.data.annotation.Id;

public class Pitcher {
    @Id
    Integer player_id;
    Integer innings_pitched;
    Integer wins;
    Integer games_started;
    Integer earned_runs;
    Double whip;
    Integer strikeouts;
    Integer saves;
    Integer walks;
    Integer losses;
    Integer runs;
    Integer shutouts;
    Integer hits;
    Integer homeruns;
    Double era;
    Double h9;
    Double hr9;
    Double bb9;
    Double so9;
    Double so_per_walk;
    Double fip;
    Integer wild_pitches;
    Integer balks;
    Integer hbp;

    public Pitcher() {
    }

    public Pitcher(Integer player_id) {
        this.player_id = player_id;
    }

    public Integer getPlayer_id() {
        return this.player_id;
    }

    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
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

    public Double getWhip() {
        return this.whip;
    }

    public void setWhip(Double whip) {
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

    public Double getEra() {
        return this.era;
    }

    public void setEra(Double era) {
        this.era = era;
    }

    public Double getH9() {
        return this.h9;
    }

    public void setH9(Double h9) {
        this.h9 = h9;
    }

    public Double getHr9() {
        return this.hr9;
    }

    public void setHr9(Double hr9) {
        this.hr9 = hr9;
    }

    public Double getBb9() {
        return this.bb9;
    }

    public void setBb9(Double bb9) {
        this.bb9 = bb9;
    }

    public Double getSo9() {
        return this.so9;
    }

    public void setSo9(Double so9) {
        this.so9 = so9;
    }

    public Double getSo_per_walk() {
        return this.so_per_walk;
    }

    public void setSo_per_walk(Double so_per_walk) {
        this.so_per_walk = so_per_walk;
    }

    public Double getFip() {
        return this.fip;
    }

    public void setFip(Double fip) {
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
