package in.vk.beans;

public class Teacher {
	public Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	} 

	public void TeacherDisplay() {
		System.out.println("I'm in teacher method"+student);
	}
}
