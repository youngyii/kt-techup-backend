package com.kt.practice.d251013.oop;

public class CheolHo extends Person {
	private String job;
	private String married;

	// 생성자
	public CheolHo(int age, String name, String identity) {
		super(age, name, identity); // 부모 클래스의 생성자 호출
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void changeAge(int age) {
		this.age = age;
	}

	@Override
	public void eat() {

	}

	@Override
	public void sleep() {

	}

	@Override
	public void walk() {

	}
}
