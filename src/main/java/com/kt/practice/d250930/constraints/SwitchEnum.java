package com.kt.practice.d250930.constraints;

// 1. 정적 제약 (컴파일 에러)
// switch-enum
// enum 타입 추가 후 case문 처리 안되어있으면 컴파일에러 발생
public class SwitchEnum {
	public enum Grade {
		BASIC, SILVER, GOLD, PLATINUM, VIP;
	}

	public static void main(String[] args) {
		Grade grade = Grade.PLATINUM;

		int rv = switch (grade) {
			case BASIC -> 0;
			case SILVER -> 1;
			case GOLD -> 2;
			case PLATINUM -> 3;
			case VIP -> 4; // 없으면 컴파일 에러 발생
		};

		System.out.println("Result: " + rv);
	}
}
