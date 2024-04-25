package com.example.demo.models;

import org.springframework.data.annotation.Id;

public class General_Manager {
    @Id
    String full_name;
    String salary;
    Integer trade_transactions;
    String manages;

    public General_Manager() {
    }

    public General_Manager(String full_name) {
        this.full_name = full_name;
    }


    public String getFull_name() {
        return this.full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getSalary() {
        return this.salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Integer getTrade_transactions() {
        return this.trade_transactions;
    }

    public void setTrade_transactions(Integer trade_transactions) {
        this.trade_transactions = trade_transactions;
    }

    public String getManages() {
        return this.manages;
    }

    public void setManages(String manages) {
        this.manages = manages;
    }

}
