package com.kt.practice.d251013.oop;

public class OOPMain {
	public static void main(String[] args) {
		// OOP (Object Oriented Programming) 객체지향 프로그래밍
		// OOP 이전에 Sequential Programming 절차지향 프로그래밍

		// 절차지향 프로그래밍
		// 하나의 main 함수에 모든 코드가 들어감
		// 아주 긴 코드라면?
		int a = 10;
		int b = 20;

		int result = a + b;
		System.out.println(result);

		// 객체지향 프로그래밍
		// 1. 캡상추다 (캡슐화, 상속, 추상화, 다형성)
		// 2. 상태(데이터)와 행위(기능) - 객체 하나는 생명체이다
		// 3. 협력하는 것
		// 4. 메세지

		// 캡슐화: 최소한의 정보만 노출 (정보은닉)
		// 접근제어자(Access Modifier)를 통해 제어
		// public - 누구나 접근 가능
		// private - 클래스 내부에서만 접근 가능
		// protected - 같은 패키지 내에서 접근 가능 + 상속 관계에 있는 자식 클래스는 다른 패키지에서도 접근 가능
		// default - 같은 패키지 내에서만 접근 가능 (아무것도 안 쓰면 기본값)

		// 추상화: 객체들의 공통적인 특징(기능, 속성)을 추출해서 정의
		// abstract: 미완성 설계도 (공통 속성 공유용) abstract class, interface
		// abstract class → 상속해서 구현 (extends)
		// interface → 규격 정의, 구현 클래스가 실행 (implements)
		// 일관된 코드 작성 가능, 유지보수 용이

		var p1 = new CheolHo(40, "철호", "123456-1234567");
		p1.getName();
		p1.getAge();
		p1.walk();

		p1.setAge(20); // 목적성이 불분명해서 잘 안 씀
		p1.changeAge(30); // 이렇게 씀
	}
}