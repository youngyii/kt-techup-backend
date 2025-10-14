package com.kt.practice.d250926.modernjava.interfaces;

// 모던 방식
// 인터페이스
public interface MeterModernJavaInterface {
	double measure();

	default String unit() {
		return "ms";
	}

	static MeterModernJavaInterface of(double v) {
		return () -> v; // 람다 -> measure()를 v로 반환하도록 구현한 익명 객체 생성
	}
}
