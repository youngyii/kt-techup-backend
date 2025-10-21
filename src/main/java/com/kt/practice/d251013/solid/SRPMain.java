package com.kt.practice.d251013.solid;

public class SRPMain {
	public static void main(String[] args) {
		// SRP(Single Responsibility Principle) 단일 책임 원칙
		// OCP(Open Closed Principle) 개방 폐쇄 원칙
		// LSP(Liskov's Substitution Principle) 리스코프 치환 원칙
		// ISP(Interface Segregation Principle) 인터페이스 분리 원칙
		// DIP(Dependency Inversion Principle) 의존관계 역전 원칙

		// SRP - 하나의 클래스는 하나의 책임만 가져야 한다

		// AService는 기능을 3개나 가지고 있다
		var aService = new AService();
		aService.a();
		var b = aService.b();

		// AddService는 1개의 기능을 가지고 있다
		var addService = new AddService();
	}
}
