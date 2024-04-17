package tester;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import com.sunbeam.Student;

public class Program01 {
	
	public Program01(int rollno, String name, double percent)
	{
		super();
	}
	

	public static void main(String[] args) {
		
		List <Student> studentList = new Vector<Student>();
		
		studentList.add(new Student(2, "ram", 98));
		studentList.add(new Student(3, "amresh", 93));
		studentList.add(new Student(1, "aarun", 80));
		studentList.add(new Student(4, "rahul", 90));
		
		
		
		System.out.println("Before Sort - ");
		
		for (Student student : studentList)
			System.out.println(student);
		
		
		
		System.out.println("\nAfter Natural Ordering --> ");
		
		Collections.sort(studentList);
		
		for (Student student : studentList)
			System.out.println(student);
		
		
		
		System.out.println("\nSorting on student name -->");

		class StudentNameComparator implements Comparator<Student> 
		{
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}
		
		Comparator<Student> studentNameComparator = new StudentNameComparator();
		
		Collections.sort(studentList, studentNameComparator);

//		
//		for (Student student : studentList)
//			System.out.println(student);
//		
		

		
		
		Student std = new Student();
		
		std.setRollno(3);

		for (Student student : studentList)
			System.out.println(student);
		
		if (studentList.contains(std))
			System.out.println("\nStudent exists\n");
		else
			System.out.println("\nStudent not found\n");
		
		

		System.out.println("Removing element at index 3\n");
		studentList.remove(3);
		
		for (Student student : studentList)
			System.out.println(student);
		
		System.out.println("\nObject at index 2 is " + studentList.get(2));
		
		System.out.println("Size of studentList : " + studentList.size());
	
		
		

	}

}
