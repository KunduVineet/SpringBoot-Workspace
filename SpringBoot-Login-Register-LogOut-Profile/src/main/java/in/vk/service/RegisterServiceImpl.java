package in.vk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vk.beans.Student;
import in.vk.dao.RegisterDAO;

@Service
public class RegisterServiceImpl implements RegisterServices{
	
	@Autowired
	RegisterDAO registerDAO;

	@Override
	public boolean registerService(Student std) {
		boolean status = registerDAO.RegisterDao(std);
		
		return status;
	}
	

}
