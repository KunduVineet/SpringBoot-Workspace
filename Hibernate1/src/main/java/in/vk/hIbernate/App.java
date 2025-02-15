package in.vk.hIbernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.vk.beans.Student;

public class App {
	public static void main(String[] args) {
		Student std = new Student();
		std.setId(1);
		std.setCity("Gurugram");
		std.setName("Suman");
		std.setRollno(12345);
		std.setEmail("suman6@gmail.com");
		std.setGender("female");

		Configuration cfg = new Configuration();
		cfg.configure("in/vk/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		try {
			session.save(std);
			System.out.println("Success");

			transaction.commit();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("fail");
			transaction.rollback();
		} finally {
			session.close();
			sessionFactory.close();
		}

	}
}
