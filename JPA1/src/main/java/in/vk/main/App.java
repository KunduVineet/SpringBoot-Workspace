package in.vk.main;

import in.vk.entity.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Student std = new Student();
    	std.setId(1);
    	std.setName("Vineet Kundu");
    	std.setEmail("kunduvineet6@gmail.com");
    	std.setMarks(98.23f);
    	
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
    	EntityTransaction entityTransaction = entityManager.getTransaction();
    	
    	try {
			entityTransaction.begin();
			
			entityManager.persist(std);
			
			entityTransaction.commit();
			
			System.out.println("success");
		} catch (Exception e) {
			// TODO: handle exception
			entityTransaction.rollback();
			System.out.println("Fail");
			
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
    }
}
