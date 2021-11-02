package com.ty.demo;

import java.util.Comparator;
import java.util.Objects;
public class Student implements Comparator<Student>{
 
	 int id;
	 int age;
	 String name;
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) 
	 {
		        Student st=(Student)obj;
				return id == st.id;
	}


	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
