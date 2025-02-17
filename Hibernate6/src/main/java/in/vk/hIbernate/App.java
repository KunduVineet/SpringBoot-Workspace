package in.vk.hIbernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.vk.beans.Employee;

public class App {
	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("in/vk/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();


		try {
			
			Employee emp = new Employee();
			emp.setEmpcity("Pune");
			emp.setEmpid(2);
			emp.setEmpname("Menu");
			emp.setEmpdept("Full Stack Java Web Developer");
			session.saveOrUpdate(emp);
			System.out.println("Success");
			transaction.commit();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Employee not exists");
		} finally {
			session.close();
			sessionFactory.close();
		}

	}
}
