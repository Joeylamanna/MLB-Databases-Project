package com.example.demo.models;

import org.springframework.data.annotation.Id;

public class Owner {
    @Id
    String full_name;
    String salary;
    String money_spent;
    String owns;

    public Owner() {
    }

    public Owner(String full_name) {
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

    public String getMoney_spent() {
        return this.money_spent;
    }

    public void setMoney_spent(String money_spent) {
        this.money_spent = money_spent;
    }

    public String getOwns() {
        return this.owns;
    }

    public void setOwns(String owns) {
        this.owns = owns;
    }
}
