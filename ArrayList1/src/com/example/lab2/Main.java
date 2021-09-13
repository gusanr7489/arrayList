package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(101, "Kim", 23);
		al.add(s1);
		Student s2 = new Student(102, "Lee", 21);
		al.add(s2);
		al.add(new Student(103, "Park", 25));
		al.add(new Student(104, "Kang", 22));
		al.add(new Student(105, "Hong", 26));
		al.add(new Student(106, "Young", 21));
		al.add(new Student(107, "Seo", 21));
		al.add(new Student(108, "Jin", 20));
		al.add(new Student(109, "Park", 24));
		al.add(new Student(110, "Lee", 23));
		
		Collections.sort(al);
		System.out.println("Student List (ordered by name)");
		for(Student s: al) {
			System.out.println(s.toString());
		}
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Student List (reverse ordered by name)");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
		
	
	}

}
