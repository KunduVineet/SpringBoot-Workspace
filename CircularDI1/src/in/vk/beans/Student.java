package in.vk.beans;

public class Student {
	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void StudentDisplay() {
		System.out.println("I'm in Student Method"+ teacher);
	}

}
