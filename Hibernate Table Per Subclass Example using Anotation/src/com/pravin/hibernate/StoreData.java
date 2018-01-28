package com.pravin.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreData {
    public static void main(String[] args) {
	Session session = new AnnotationConfiguration().configure()
		.buildSessionFactory()
		.openSession();
	Transaction transaction = session.beginTransaction();

	Employee employee1 = new Employee();
	employee1.setEmpName("pravin");

	Regular_Employee employee2 = new Regular_Employee();
	employee2.setEmpName("Ajay Devgan");
	employee2.setSalary(65000);
	employee2.setBonus(12);

	Contract_Employee employee3 = new Contract_Employee();
	employee3.setEmpName("Akshay Kumar");
	employee3.setPay_per_hour(45000);
	employee3.setContract_duration("1 yr");

	session.persist(employee1);
	session.persist(employee2);
	session.persist(employee3);

	transaction.commit();
	session.close();
	System.out.println("Success!");
    }
}
