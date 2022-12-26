package com.Scanner.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Scanner.Entity.UserClass;
import com.Scanner.dao.UserDao;

public class UserImpl implements UserDao {
	public void addUser() {
		Session session = com.Scanner.hibernateUtil.UserUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		long user_id;
		String fn, ln, email;
		int age;
		Scanner S = new Scanner(System.in);

		System.out.println("Enter user id");
		user_id = S.nextInt();
		System.out.println("enter First name");
		fn = S.next();
		System.out.println("enter last name");
		ln = S.next();
		System.out.println("enter email");
		email = S.next();
		System.out.println("enter Age");
		age = S.nextInt();
		UserClass u = new UserClass();
		u.setId(user_id);
		u.setFristname(fn);
		u.setLastname(ln);
		u.setEmail(email);
		u.setAge(age);
		session.save(u);
		t.commit();
		System.out.println("user record save");
		session.close();
	}

	public void readUser() {
		Session session = com.Scanner.hibernateUtil.UserUtil.getSessionFactory().openSession();
		long i;
		Scanner S = new Scanner(System.in);

		System.out.println("enter user id");
		i = S.nextLong();
		UserClass W = session.get(UserClass.class, i);
		System.out.println("user id : " + W.getId() + "user frist Name : " + W.getFristname() + "last name : "
				+ W.getLastname() + " Email :" + W.getEmail() + "Age :" + W.getAge());
	}

	public void updateser() {
		Session session = com.Scanner.hibernateUtil.UserUtil.getSessionFactory().openSession();
		Scanner S = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter user id");
		long j = S.nextLong();
		UserClass W = session.get(UserClass.class, j);
		System.out.println("enter you update Email");
		String em = S.next();
		session.update(W);
		t.commit();
		System.out.println("updated Successfully");
		session.close();
	}

	public void deleteUser() {
		Session session = com.Scanner.hibernateUtil.UserUtil.getSessionFactory().openSession();
		Scanner S = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter user id");
		long k = S.nextLong();
		UserClass W = session.get(UserClass.class, k);
		session.delete(k);
		t.commit();
		System.out.println("deleted");
		session.close();
	}

}
