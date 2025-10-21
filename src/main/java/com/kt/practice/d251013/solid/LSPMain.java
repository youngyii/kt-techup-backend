package com.kt.practice.d251013.solid;

public class LSPMain {
	public static void main(String[] args) {
		// SRP(Single Responsibility Principle) 단일 책임 원칙
		// OCP(Open Closed Principle) 개방 폐쇄 원칙
		// LSP(Liskov's Substitution Principle) 리스코프 치환 원칙
		// ISP(Interface Segregation Principle) 인터페이스 분리 원칙
		// DIP(Dependency Inversion Principle) 의존관계 역전 원칙

		// LSP - 상속 관계에서 자식 클래스는 부모 클래스의 역할을 대체할 수 있어야 한다

		NotificationService slackService = new SlackService();
		slackService.send("Hello, Slack!");

		// 자식 클래스는 메시지를 보낼 수 없으므로 원칙 위반
		NotificationService mailService = new MailService();
		mailService.send("Hello, Mail!");    // UnsupportedOperationException
	}
}
