package com.sunbeam;


public class Student implements Comparable<Student>
{
	

	private int rollno;
	private String name;
	private double percentage;
	
	public Student()
	{}

	public Student(int rollno, String name, double percentage) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public int compareTo(Student o) {
		
		return (this.rollno - o.rollno);
	}
	

	@Override
	public String toString() {
		return "Student : rollno= " + rollno + ", name= " + name + ", percentage= " + percentage ;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (obj == null)
			return false;
		else if (this == obj)
			return true;
		else if (obj instanceof Student) 
		{
			Student e = (Student) obj;
			return e.rollno == this.rollno;
		}
		return false;
	}
	
	
	
	

}
