package in.vk.hIbernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.vk.beans.Employee;

public class App {
	public static void main(String[] args) {
		Employee std = new Employee();
		std.setEmpid(1);
		std.setEmpcity("Gurugram");
		std.setEmpname("Suman");
		std.setEmpdept("IT");

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
