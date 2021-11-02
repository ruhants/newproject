package com.ty.demo;

import java.util.Comparator;

public class Name implements Comparator<Student> {
	private int id;

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	

}

