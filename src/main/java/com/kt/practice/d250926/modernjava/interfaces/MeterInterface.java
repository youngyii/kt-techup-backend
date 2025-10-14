package com.kt.practice.d250926.modernjava.interfaces;

// 전통적인 방식
// 인터페이스(Interface)
public interface MeterInterface {
	double measure(); // 측정값을 반환하는 메서드

	String result();

	default String unit() {
		return "ms";
	}
}