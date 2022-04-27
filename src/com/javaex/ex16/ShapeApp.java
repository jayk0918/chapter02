package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		// 섞어쓰기 (부모쪽만 보이게 만드는 기법, 부모-자식의 관계가 성립했을 때만 가능)
		Shape s = new Shape("빨강", "노랑");
		
		Rectangle r = new Rectangle("빨강", "검정", 5, 5);
		
		Shape shapeR01 = new Rectangle("빨강", "검정", 15, 15);
		s.draw();
		r.draw();
		shapeR01.draw();
		
		//System.out.println(shapeR01.toString());
		// shapeR01.getwidth -> 오류발생, shape의 필드값만 나옴(메모리에는 Rectangle까지 올라가나 보이는 것은 부모 뿐)
		
		// Shape의 배열을 만들어 도형전체를 관리하고자 함.
		// 이전에는 각 도형들을 각각 관리해왔었는데 이제 일괄통제하겠다는 뜻
		// Shape의 자식 클래스를 관리하는 것보다 부모를 배열화 시키는게 더 중요한 상황이라고 가정 
		
		// Shape 배열 생성
		Shape[] sArray = new Shape[6];
		
		// 사각형 2개
		Shape r01 = new Rectangle("보라", "빨강", 4, 4); 
		Shape r02 = new Rectangle("초록", "파랑", 2, 2);
		
		// 삼각형 2개
		Shape t01 = new Triangle("노랑", "청록", 3, 3);
		Shape t02 = new Triangle("파랑", "검정", 10, 10);
		
		// 원 2개
		Shape c01 = new Circle("검정", "하양", 5);
		Shape c02 = new Circle("민트", "민트", 7);
		
		// 배열에 담기
		sArray[0] = r01;
		sArray[1] = r02;
		sArray[2] = t01;
		sArray[3] = t02;
		sArray[4] = c01;
		sArray[5] = c02;
		
		System.out.println(sArray[0].toString());
		// Shape 선언으로 인해 가려진 상태임에도 불구하고 toString은 Rectangle의 toString을 출력함
		// Rectangle과 Shape의 toString의 이름이 같기에 Rectangle의 toString이 덮어씀 : 메소드 오버라이딩
		// cf) 상황이 충족되면 원치 않아도 오버라이딩됨
		
		sArray[0].draw();
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
			System.out.println(sArray[i].area());
		}
		
		// 시선을 바꾸는 방법 (캐스팅 - 강제형변환)
		// 앞에 자식클래스를 ()에 씌움으로써 자식클래스의 값을 소환할 수 있음
		((Rectangle)sArray[0]).getWidth();
		
	}

}
