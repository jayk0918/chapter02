package com.javaex.ex12;

public class Person {
	
	// 필드
	private String name; // protected : 상속받은 클래스까지 내 필드처럼 사용 허가
	private int age;
	
	// 생성자
	public Person() {
		System.out.println("Person()");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}
	
	// 메소드 gs
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	// 메소드 일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void showInfo() {
		System.out.println("이름: "+ name + ", 나이: " + age);
	}
	
	
}
