package com.kt.practice.d250930.constraints;

// 1. 정적 제약 (컴파일 에러)
// final
// 재할당/변경 차단으로 사이드이펙트(부수효과) 최소화
public class Final {
	public class Constants {
		public static final String APP_NAME = "MyApplication";
	}

	public static class Person {
		final String name;
		final int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	public static void main(String[] args) {
		final Person person = new Person("Alice", 30);
		// 컴파일 오류: final 참조 변수는 재할당 불가
		//person = new Person("Bob", 31);
		//person.name = "Bob";
		//person.age = 31;

		System.out.println("Application Name: " + Constants.APP_NAME);
	}
}
