package com.kt.practice.d251013.solid;

public class DefaultBFunction implements BFunction {
	@Override
	public int add(int a, int b) {
		System.out.println("DefaultBFunction의 add 기능");
		return a + b;
	}
}
