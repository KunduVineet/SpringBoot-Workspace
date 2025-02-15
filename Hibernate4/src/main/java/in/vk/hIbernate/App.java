package in.vk.hIbernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.vk.beans.Employee;

public class App {
	public static void main(String[] args) {
		Employee std = new Employee();
		std.setEmpcity("Gurugram");
		std.setEmpname("Vineet Kundu");
		std.setEmpdept("IT and Infrastructure");

		Configuration cfg = new Configuration();
		cfg.configure("in/vk/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		try {
			session.persist(std);
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
