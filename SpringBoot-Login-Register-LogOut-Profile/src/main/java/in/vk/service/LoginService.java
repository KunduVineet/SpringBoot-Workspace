package in.vk.service;

import java.util.List;

import in.vk.beans.Student;

public interface LoginService {

	public List<Student> loginservice(String email,String password); 
}
