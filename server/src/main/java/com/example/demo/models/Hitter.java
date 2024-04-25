package com.example.demo.models;

import org.springframework.data.annotation.Id;

public class Hitter {
    @Id
    Integer player_id;
    Integer hits;
    Integer at_bats;
    Integer rbis;
    Integer singles;
    Integer stolen_bases;
    Double batting_average;
    Double obp;
    Integer strikeouts;
    Double ops;
    Integer caught_stealing;
    Integer triples;
    Integer walks;
    Integer doubles;
    Integer homeruns;
    Integer plate_appearances;
    Double slugging;
    Integer total_bases;
    Integer gdp;
    Integer hbp;

    public Hitter() {
    }

    public Hitter(Integer player_id) {
        this.player_id = player_id;
    }

    public Integer getPlayer_id() {
        return this.player_id;
    }

    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }

    public Integer getHits() {
        return this.hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getAt_bats() {
        return this.at_bats;
    }

    public void setAt_bats(Integer at_bats) {
        this.at_bats = at_bats;
    }

    public Integer getRbis() {
        return this.rbis;
    }

    public void setRbis(Integer rbis) {
        this.rbis = rbis;
    }

    public Integer getSingles() {
        return this.singles;
    }

    public void setSingles(Integer singles) {
        this.singles = singles;
    }

    public Integer getStolen_bases() {
        return this.stolen_bases;
    }

    public void setStolen_bases(Integer stolen_bases) {
        this.stolen_bases = stolen_bases;
    }

    public Double getBatting_average() {
        return this.batting_average;
    }

    public void setBatting_average(Double batting_average) {
        this.batting_average = batting_average;
    }

    public Double getObp() {
        return this.obp;
    }

    public void setObp(Double obp) {
        this.obp = obp;
    }

    public Integer getStrikeouts() {
        return this.strikeouts;
    }

    public void setStrikeouts(Integer strikeouts) {
        this.strikeouts = strikeouts;
    }

    public Double getOps() {
        return this.ops;
    }

    public void setOps(Double ops) {
        this.ops = ops;
    }

    public Integer getCaught_stealing() {
        return this.caught_stealing;
    }

    public void setCaught_stealing(Integer caught_stealing) {
        this.caught_stealing = caught_stealing;
    }

    public Integer getTriples() {
        return this.triples;
    }

    public void setTriples(Integer triples) {
        this.triples = triples;
    }

    public Integer getWalks() {
        return this.walks;
    }

    public void setWalks(Integer walks) {
        this.walks = walks;
    }

    public Integer getDoubles() {
        return this.doubles;
    }

    public void setDoubles(Integer doubles) {
        this.doubles = doubles;
    }

    public Integer getHomeruns() {
        return this.homeruns;
    }

    public void setHomeruns(Integer homeruns) {
        this.homeruns = homeruns;
    }

    public Integer getPlate_appearances() {
        return this.plate_appearances;
    }

    public void setPlate_appearances(Integer plate_appearances) {
        this.plate_appearances = plate_appearances;
    }

    public Double getSlugging() {
        return this.slugging;
    }

    public void setSlugging(Double slugging) {
        this.slugging = slugging;
    }

    public Integer getTotal_bases() {
        return this.total_bases;
    }

    public void setTotal_bases(Integer total_bases) {
        this.total_bases = total_bases;
    }

    public Integer getGdp() {
        return this.gdp;
    }

    public void setGdp(Integer gdp) {
        this.gdp = gdp;
    }

    public Integer getHbp() {
        return this.hbp;
    }

    public void setHbp(Integer hbp) {
        this.hbp = hbp;
    }

}
