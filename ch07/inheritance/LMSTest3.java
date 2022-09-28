package com.ruby.java.ch07.inheritance;

public class LMSTest3 {

	static void display(Person[] p) {
		for (int i = 0; i < 6; i++) {
			System.out.println(p[i].toString());
		}
	}
	
	public static void main(String[] args) {
		Person[] list = new Person[6];
		Person p0 = new Person();
		Person p1 = new Person("오정임");
		Person p2 = new Person("오정임", 47);
		Employee e = new Employee("오정임", 47, "입학처");
		Professor p = new Professor("김푸름", 52, "빅데이터");
		Student s = new Student("김유빈", 20, "컴퓨터과학");
		
		list[0] = p0;
		list[1] = p1;
		list[2] = p2;
		list[3] = e;
		list[4] = p;
		list[5] = s;

		display(list);
		
		
	}

}

// inheritance test3
// homework
