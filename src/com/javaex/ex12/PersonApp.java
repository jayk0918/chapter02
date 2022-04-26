package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		Person person01 = new Person("김재환", 30);
		//System.out.println(person01);
		person01.showInfo();
		
		Student student01 = new Student("서울고등학교");
		System.out.println(student01.toString());
		
		// extends 이후
		Student student02 = new Student();
		
		student02.setName("김재환"); // 부모 클래스 생성자 자유롭게 사용 가능
		student02.setAge(30);
		student02.setSchoolName("서울고등학교");
		System.out.println(student02.toString());
		
		Student student03 = new Student("서울고등학교");
		System.out.println(student03.toString());
		// 부모 클래스 Person()의 생성자부터 적용됨
		
		// 자식 클래스에서 부모 생성자를 super로 호출 + 자식 생성자
		Student student04 = new Student("김재환", 30, "서울고등학교");
		System.out.println(student04.toString());
		student04.showInfo();
		// toString의 경우 -> 부모 클래스의 toString을 자식 클래스에 같은 이름으로 '재정의'함으로써 덮어쓰기 가능
		// 부모 통제법
		
		// 필드값 private = 부모-자식 간이라도 사용 불가능
		
		
	}

}
