package crud;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Student.Student;

public class Crud {
	static SessionFactory s;// object of session

	public static void main(String[] args) {// main method

		s = new Configuration().configure().buildSessionFactory();// getting connection

		Crud c = new Crud();// object of crud
		c.registration("Abhi", "Shaw", 20000, 974865895);// setting values
		c.registration("Saroj", "Shaw", 3500, 847098652);
		c.read();// reading values
		c.update(1, 2500);// updating value
		c.delete(2);// deleting values

	}

//method for registration
	public void registration(String firstName, String lastName, double fee, long phone) {
		try {
			Session ses = s.openSession();
			Transaction t = ses.beginTransaction();

			Student st = new Student();
			st.setLastName(lastName);// seting values
			st.setFirstName(firstName);
			st.setPhone(phone);
			st.setFee(fee);
			ses.save(st);
			t.commit();

		} catch (

		Exception e) {
			System.out.println(e);
		}
	}

//method for read
	public void read() {
		try {
			Session ses = s.openSession();
			List Stu = ses.createQuery("from clgStudent").list();// reading from database
			for (Iterator itr = Stu.iterator(); itr.hasNext();) {
				Student e = (Student) itr.next();
				System.out.println(e.getId() + " " + e.getFirstName() + " " + e.getLastName() + " " + e.getFee() + " "
						+ e.getPhone());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

//method for upadate
	public void update(int id, double fee) {

		try {
			Session ses = s.openSession();
			Transaction t = ses.beginTransaction();
			Student e = ses.get(Student.class, id);
			e.setFee(fee);
			ses.update(e);
			t.commit();
			System.out.println("Updated Successfully");
		} catch (Exception e) {
			System.out.println(e);

		}
	}

//method for delete
	public void delete(int id) {
		try {
			Session ses = s.openSession();
			Transaction t = ses.beginTransaction();
			Student e = ses.get(Student.class, id);
			ses.delete(e);
			t.commit();
			System.out.println("Deleted Succesfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
