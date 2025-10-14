package com.kt.practice.d250926.modernjava.interfaces;

public class MeterMain {
	public static void main(String[] args) {
		// 인터페이스로 참조하고 구현체로 생성
		MeterInterface defaultMeter = new DefaultMeter();
		System.out.println("Deafult Meter Measurement: " + defaultMeter.measure());
		System.out.println("Default Meter Result: " + defaultMeter.result());

		MeterModernJavaInterface meter = MeterModernJavaInterface.of(250.5);
		System.out.println("Modern Java Meter Measurement: " + meter.measure());
	}
}