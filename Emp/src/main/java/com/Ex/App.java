package com.Ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	// configure-Activevates hibernate frame work
	// configure-rewad both clg filese and and mappinhg details
	// build session factory -From clf objecty it tale jdbc information and create a
	// jdbc connection
	public static void main(String[] args) {
		// SessionFactory S = new Configuration().configure().buildSessionFactory();
		// open an connection with db and session object preform crud

		// Session ses = S.openSession();// open A the method of sesion Factry to get
		// sessoin obj

		// Transaction t = ses.beginTransaction();
		Emp e = new Emp();// create object of prersentace class
		e.setEmpId(101);// use objest to enter data in the table using getter setter
		e.setEmpFristname("Abhishek");
		
		e.setEmplastName("Shaw");
		e.setEmpmail("Abhi@11");
		e.setEmpPhone(112124242);
		e.setEmpAdd("kolkata");
		e.setEmpSalary(152000);
//		ses.save(e);// sesion object is used to save the presistent object
//		t.commit();// trancation commited
//		ses.close();// session closed
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Emp.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory(); // 37:30
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(e);
		transaction.commit();
	}
}
