package in.vk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vk.beans.Student;
import in.vk.dao.LoginDAOImpl;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDAOImpl loginDAOImpl;
	
	@Override
	public List<Student> loginservice(String email, String password) {

		List<Student> student_list = loginDAOImpl.loginDao(email, password);
		return student_list;
	}

}
