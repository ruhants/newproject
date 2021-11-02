package com.ty.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentAcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<Student> st=new HashSet<Student>();
    st.add(new Student(01,24,"anuj"));
    st.add(new Student(03,25,"Chandan"));
    st.add(new Student(02,23,"Suraj"));
    st.add(new Student(04,22,"Bavish"));
    st.add(new Student(03,25,"Chandan"));
    
    for (Student student : st) {
    	System.out.println(st);
		
	}
    
    List<Student> st1=new ArrayList<>(st);
    
    Collections.sort(st1, new Id());
  
    	System.out.println(st1);
		
	Scanner sc=new Scanner(System.in);
    int input=sc.nextInt();
    if(input==1) {
    	 Collections.sort(st1, new Id());
    	System.out.println(st1);
    }else if(input==2){
    	 Collections.sort(st1, new Age());
    	System.out.println(st1);
    }else if(input==3) {
    	Collections.sort(st1, new Name());
    	System.out.println(st1);
    }else if(input==4) {
    	System.exit(input);
    }
    
	}

}
