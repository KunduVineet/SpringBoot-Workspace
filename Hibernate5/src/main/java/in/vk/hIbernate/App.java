package in.vk.hIbernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.vk.beans.Employee;

public class App {
	public static void main(String[] args) {
//		Employee std = new Employee();
//		std.setEmpcity("Gurugram");
//		std.setEmpname("Vineet Kundu");
//		std.setEmpdept("IT and Infrastructure");

		Configuration cfg = new Configuration();
		cfg.configure("in/vk/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();


		try {
//			int id = (int) session.save(std);
//			System.out.println(id);
//			System.out.println("Success");
//

//			Employee emp = session.get(Employee.class, 2);
			Employee emp = session.load(Employee.class, 40);

			System.out.println("Employee ID: "+ emp.getEmpid());
			System.out.println("Employee Name: "+ emp.getEmpname());
			System.out.println("Employee Department: "+ emp.getEmpdept());
			System.out.println("Employee City: "+ emp.getEmpcity());

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Employee not exists");
		} finally {
			session.close();
			sessionFactory.close();
		}

	}
}
