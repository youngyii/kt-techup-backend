package com.kt.practice.d250926.modernjava.optional;

import java.util.Optional;

public class OptionalMain {
	public static void main(String[] args) {
		// Optional = Null을 다루는 기술
		// NPE = Null Pointer Exception

		// Optional.of
		Optional<String> optionalStirng =
			Optional.of("Hello, kt Cloud Tech Up Back-End First Team!");

		// Optional.ofNullable
		// 나이를 가져오는데 null이면 0
		Optional<Integer> optionalAge = Optional.ofNullable(null);
		int age = optionalAge.orElseGet(() -> {
			return 0;
		});
		System.out.println(age);

		Optional<Person> optionalPerson = Optional.ofNullable(null);
		//Person p = null;
		//System.out.println(p.age); // 오류

		// orElseGet
		Person p1 = optionalPerson.orElseGet(() -> {
			Person p3 = new Person(0, "초기값");
			p3.age = 100;
			return p3;
		});

		// orElse: 기본값 간단할 때
		Person p2 = optionalPerson.orElse(new Person(0, "초기값"));

		System.out.println(p1.age);
		System.out.println(p2.age);

		// ifPresent: 값 있을 때만 로직 수행
		optionalPerson.ifPresent(person -> {
			System.out.println("값이 존재합니다.");
		});

		// ifPresentOrElse
		optionalPerson.ifPresentOrElse(person -> {
				System.out.println("값이 존재합니다.");
			}, () -> {
				System.out.println("값이 존재하지 않습니다.");
			}
		);

		// orElseThrow
		Optional<Person> optionalPerson2 = Optional.empty();
		//optionalPerson2.orElseThrow(() -> new IllegalArgumentException());
	}
}