package com.kt.practice.d251013.oop;

public class NaHyeon extends Person {
	private String student;
	private String glass;

	public NaHyeon(int age, String name, String identity, String student, String glass) {
		super(age, name, identity);
		this.student = student;
		this.glass = glass;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
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
