package com.ty.demo;

import java.util.Comparator;

public class Age implements Comparator<Student> {
	private int id;

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return this.id-o2.id;
	}
	

}



