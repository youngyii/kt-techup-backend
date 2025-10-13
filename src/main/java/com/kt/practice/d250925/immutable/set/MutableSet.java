package com.kt.practice.d250925.immutable.set;

import java.util.HashSet;
import java.util.Set;

public class MutableSet {
	public static void main(String[] args) {
		// 나: Person 클래스는 불변 필드(final) 사용 -> 한 번 생성된 Person 객체의 상태 변경 불가
		// 객체 내부 상태가 변하지 않음
		Set<Person> people = new HashSet<>(); // 가변 Set: 값 추가/삭제 가능

		Person p1 = new Person("Alice", 30);
		Person p2 = new Person("Alice", 30);

		people.add(p1);
		people.add(p2); // 중복된 객체는 추가되지 않음

		System.out.println(people);
	}
}
