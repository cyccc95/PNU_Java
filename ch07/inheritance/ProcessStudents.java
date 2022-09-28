package com.ruby.java.ch07.inheritance;
class Students {
	private String pno;
	private String pname;
	private int age;
	
	public Students() {
		
	}
	
	public Students(String pno, String pname, int age) {
		this.pno = pno;
		this.pname = pname;
		this.age = age;
	}
	
	public void show() {
		System.out.println("pno : " + pno);
		System.out.println("pname : " + pname);
		System.out.println("age : " + age);
	}
}

class StudyStudent extends Students {
	private String schoolName;
	private int schoolYear;
	
	public StudyStudent() {
		
	}
	
	public StudyStudent(String pno, String pname, int age) {
		super(pno, pname, age);
	}
	
	public StudyStudent(String pno, String pname, int age, String schoolName, int schoolYear) {
		super(pno, pname, age);
		this.schoolName = schoolName;
		this.schoolYear = schoolYear;
	}
	
	public void show() {
		super.show();
		System.out.println("schoolName : " + schoolName);
		System.out.println("schoolYear : " + schoolYear);
	}
}

class BestStudent extends StudyStudent {
	private String subject;
	
	public BestStudent() {
		
	}
	
	public BestStudent(String pno, String pname, int age) {
		super(pno, pname, age);
	}
	
	public BestStudent(String pno, String pname, int age, String schoolName, int schoolYear) {
		super(pno, pname, age, schoolName, schoolYear);
	}
	
	public BestStudent(String pno, String pname, int age, String schoolName, int schoolYear, String subject) {
		super(pno, pname, age, schoolName, schoolYear);
		this.subject = subject;
	}
	
	public void show() {
		super.show();
		System.out.println("subject : " + subject);
		
	}
}

public class ProcessStudents {

	public static void main(String[] args) {
		BestStudent bs = new BestStudent();
		BestStudent bs2 = new BestStudent("p06","Choi",28);
		BestStudent bs3 = new BestStudent("p06","Choi",28,"PNU",2014);
		BestStudent bs4 = new BestStudent("p06","Choi",28,"PNU",2014,"Java");
		bs.show();
		System.out.println("------------");
		bs2.show();
		System.out.println("------------");
		bs3.show();
		System.out.println("------------");
		bs4.show();
		
	}

}

// inheritance 연습
