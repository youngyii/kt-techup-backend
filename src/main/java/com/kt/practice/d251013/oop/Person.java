package com.kt.practice.d251013.oop;

public abstract class Person implements PersonFunction {
	protected int age;
	protected String name;
	protected String identity;

	public Person(int age, String name, String identity) {
		this.age = age;
		this.name = name;
		this.identity = identity;
	}

	public String getName() {
		return name;
	}
}
