package com.kt.practice.d250930.constraints;

import java.util.Optional;

// 2. 런타임 제약 (실행중인 코드에서 동작 제약)
// Optional
public class OptionalExample {
	public static void main(String[] args) {
		String name = null;
		String test = Optional.ofNullable(name).orElse("default name");
		System.out.println(test);

		String name2 = "Alice";
		String test2 = Optional.ofNullable(name2).orElse("default name");
		System.out.println(test2);

		// exception
		String name3 = null;
		String test3 = Optional.ofNullable(name3).orElseThrow(() -> new IllegalArgumentException("Name is null"));
		System.out.println(test3);
	}
}
