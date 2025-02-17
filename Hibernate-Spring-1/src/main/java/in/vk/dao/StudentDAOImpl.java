package in.vk.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import in.vk.beans.Student;
import jakarta.transaction.Transactional;

public class StudentDAOImpl implements StudentDAO{
	
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	@Override
	public void addStdDetails(Student std) {
		try {
			hibernateTemplate.save(std);
			System.out.println("Sucees");
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Fail");
		}
	}

}
