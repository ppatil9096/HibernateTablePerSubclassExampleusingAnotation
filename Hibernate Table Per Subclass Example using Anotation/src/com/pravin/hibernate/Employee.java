package com.pravin.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TPS_ANNOTATION_EMP")
public class Employee {
    @Id
    @Column(name = "empId")
    private int empId;
    @Column(name = "empName")
    private String empName;

    public int getEmpId() {
	return empId;
    }

    public void setEmpId(int empId) {
	this.empId = empId;
    }

    public String getEmpName() {
	return empName;
    }

    public void setEmpName(String empName) {
	this.empName = empName;
    }

}
