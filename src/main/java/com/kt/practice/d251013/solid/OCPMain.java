package com.kt.practice.d251013.solid;

public class OCPMain {
	public static void main(String[] args) {
		// SRP(Single Responsibility Principle) 단일 책임 원칙
		// OCP(Open Closed Principle) 개방 폐쇄 원칙
		// LSP(Liskov's Substitution Principle) 리스코프 치환 원칙
		// ISP(Interface Segregation Principle) 인터페이스 분리 원칙
		// DIP(Dependency Inversion Principle) 의존관계 역전 원칙

		// OCP - 확장에는 열려있어야 하고, 변경에는 닫혀 있어야 한다

		String profile = "prod";

		switch (profile) {
			case "default" -> {
				BFunction bFunction = new DefaultBFunction();
				System.out.println(bFunction.add(1, 2));
			}
			case "dev" -> {
				BFunction bFunction = new DevBFunction();
				System.out.println(bFunction.add(1, 2));
			}
			case "prod" -> {
				BFunction bFunction = new ProdBFunction();
				System.out.println(bFunction.add(1, 2));
			}
			default -> throw new IllegalStateException("Unexpected value: " + profile);
		}
	}
}
