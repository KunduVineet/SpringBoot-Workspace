package in.vk.beans;

import org.springframework.beans.factory.BeanNameAware;

public class Student implements BeanNameAware{
	private static String name;
	private static int id;
	private static String beanName;
	
	public Student(int a) {
		System.out.println("Creating a constructor");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void display() {
		System.out.println("hii");
	}

	public static Student createStudent() {
		System.out.println("static factory method invoked");
		System.out.println("name:"+ name);
		System.out.println("id" +id);
		System.out.println(beanName);
		return new Student(10);
	}

	@Override
	public void setBeanName(String beanName) {
		Student.beanName = beanName;
	}
}
