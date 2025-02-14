package in.vk.services;

import in.vk.beans.Student;
import in.vk.dao.StudentDAO;

public class StudentServiceImpl implements StudentService {
	
	private StudentDAO stdDao;

	public void setStdDao(StudentDAO stdDao) {
		this.stdDao = stdDao;
	}

	public boolean addStdDetailsService(Student std) {
		
		boolean status = stdDao.addStdDetailsDao(std);
		return status;
	}

}
