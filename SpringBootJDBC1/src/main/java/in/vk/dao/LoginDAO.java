package in.vk.dao;

import java.util.List;

import in.vk.beans.Student;

public interface LoginDAO {

	public List<Student> loginDao(String email, String password);
}
