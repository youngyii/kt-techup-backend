package com.kt.practice.d251013.solid;

public class DIPMain {
	public static void main(String[] args) {
		// SRP(Single Responsibility Principle) 단일 책임 원칙
		// OCP(Open Closed Principle) 개방 폐쇄 원칙
		// LSP(Liskov's Substitution Principle) 리스코프 치환 원칙
		// ISP(Interface Segregation Principle) 인터페이스 분리 원칙
		// DIP(Dependency Inversion Principle) 의존관계 역전 원칙

		// DIP - 구체화된 클래스에 의존하기 보다는 추상 클래스나 인터페이스에 의존해야 한다

		// NotificationService -> 추상화(인터페이스)
		// SlackService -> 구체화(구현체)
		NotificationService notificationService = new SlackService();
	}
}
