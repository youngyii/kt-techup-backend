package com.kt.practice.d250925.immutable.set;

import java.util.Objects;

public class Person {
	// 불변 필드
	final String name;
	final int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() { // 같은 name, age -> 같은 hashCode
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		// == 객체의 메모리 주소값이 똑같으면 true
		if (this == obj)
			return true;
		// instanceof ==> typeOf
		// obj가 Person 타입이면 true
		if (obj instanceof Person p) { // name, age 같으면 true
			return this.name.equals(p.name) && this.age == p.age;
		}

		return false;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}
}
