package in.vk.beans;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		boolean b = Student.class.equals(clazz);
		return b;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Student std = (Student)target;
		
		if(std.getName().equals("") || std.getName().equals("null")) {
			errors.rejectValue("name", "key_name", "Name is not Valid");
		}
		if(std.getRollno()==0) {
			errors.rejectValue("rollno", "key_rollno", "Roll no. is not Valid");
		}
		if(std.getPhone().length() != 10) {
			errors.rejectValue("phone", "key_phone", "Phone no. is not Valid");
		}
	}

}
