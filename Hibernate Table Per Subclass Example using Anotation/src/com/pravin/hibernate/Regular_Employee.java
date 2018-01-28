package com.pravin.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Regular_Employee extends Employee {
    @Column(name = "salary")
    private float salary;
    @Column(name = "bonus")
    private int bonus;

    public float getSalary() {
	return salary;
    }

    public void setSalary(float salary) {
	this.salary = salary;
    }

    public int getBonus() {
	return bonus;
    }

    public void setBonus(int bonus) {
	this.bonus = bonus;
    }

}
