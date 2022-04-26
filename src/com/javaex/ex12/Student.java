package com.javaex.ex12;

public class Student extends Person {	// 자식 클래스 + extends + 부모 클래스
	
	// 필드
	private String schoolName;
	
	// 생성자
	public Student() {
		super(); // 부모 클래스에 특정 대상을 지정하지 않는다면 생략 가능
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {
		super(); 
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		super(name,age); // 부모 생성자를 호출하기 위해서는 => super 사용
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	
	// 메소드 gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	// 메소드 일반
	
	public void showInfo() {	//부모 클래스의 showInfo를 일부 차용 + 자식 클래스 단계에서 살을 좀 더 붙인다면?
		super.showInfo();	// 주의 : 부모와 자식 모두에게 showInfo가 존재하므로 '부모'의 showInfo를 차용하고자 한다면 반드시 super 기재
		System.out.println("학교: " + this.schoolName);			
	}
	
	// 부모의 필드 or 메소드가 public일 경우 부모의 영역 표시를 super로 표기
	// 부모 클래스의 필드/메소드가 public이면 자신의 것 처럼 사용할 수 있으나 캡슐화가 파괴됨 -> risk
	
	
	@Override
	public String toString() {
		return "Student [schoolName=" + this.schoolName + ", getName()=" + super.getName() + ", getAge()=" + super.getAge()
				+ ", toString()=" + super.toString() + ", getClass()=" + super.getClass() + ", hashCode()=" + hashCode()
				+ "]";				//super.(..) : 보다 엄격한 표기법
	}
	
	
	

	
}
