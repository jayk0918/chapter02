package com.javaex.ex18;

public interface Drawable {
	// interface = 클래스가 아님
	// 다중상속 효과를 위해 구성함
	// interface를 상속받고자 한다면 interface 내부 메소드들에 대하여 자식 클래스에서 모두 정의되어야 함
	// interface의 이름은 ~~+'able'이 국룰임
	
	// 세계관 설명 : point(점)이라는 새로운 구성요소가 도형(shape)에 포함되어 관리되기를 원함
	// draw() 메소드 이외에 공통부분은 없음
	// 이에 따라 interface를 작성하게 되었음
	
	
	// 필드, 생성자, 메소드 gs는 존재이유가 없음
	// 메소드 일반 -> 내용은 작성하지 않음 / 제목만 필요함
	// 자식들이 알아서 정의하여 override해야 함
	
	// cf) 엄밀히 말하면 override라고 할 순 없음 (기존 값을 덮어쓰는 것이 아니라 interface를 만든 목적 차이가 있기 때문)
	
	public void draw();
	
}
