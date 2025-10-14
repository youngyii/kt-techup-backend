package com.kt.practice.d250926.modernjava.interfaces;

// 전통적인 방식
// 구현 클래스(Implementation)를 따로 둠.
public class DefaultMeter implements MeterInterface {
	@Override
	public double measure() {
		return new Meter(100).value;
	}

	@Override
	public String result() {
		return new Meter(100).value + unit();
	}
}