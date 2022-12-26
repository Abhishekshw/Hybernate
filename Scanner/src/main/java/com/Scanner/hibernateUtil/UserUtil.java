package com.Scanner.hibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserUtil {
	private static SessionFactory sessionfactory;
	static {
		try {
			sessionfactory = new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionfactory;
	}

}
