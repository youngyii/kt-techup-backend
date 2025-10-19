package com.kt.practice.d250929.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
	public static void main(String[] args) {

		List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve"); // 불변 리스트
		// filter: 알파벳 e가 들어간 이름들만 모아서 출력
		// jdk8부터 stream 사용 가능
		var filteredNames = names.stream()
			.filter(name -> name.contains("e")) // equals("Alice")
			//.collect(Collectors.toList()); // jdk8부터
			.toList(); // jdk11부터 // 불변 리스트
		System.out.println(filteredNames);

		var newNames = new ArrayList<String>(); // 가변 리스트
		names.forEach(name -> {
			if (name.contains("e")) {
				// 새로운 배열에 넣어줘야
				newNames.add(name);
			}
		});
		newNames.add("나현");// 불변성 지킬 수 없음
		System.out.println(newNames);

		// map: 각 요소 변환
		var mappedNames = names.stream()
			.filter(name -> name.contains("e"))
			//.map(name -> name.toUpperCase()) // 람다식
			.map(String::toUpperCase) // 메서드 참조 -> 간결
			.toList();

		System.out.println(names);
		System.out.println(mappedNames);

		var userRequests = List.of(
			new UserCreateRequest(
				"alice",
				1,
				LocalDate.now().minusYears(1)
			),
			new UserCreateRequest(
				"bob",
				5,
				LocalDate.now().minusYears(3)
			),
			new UserCreateRequest(
				"charlie",
				2,
				LocalDate.now().minusYears(1)
			),
			new UserCreateRequest(
				"eve",
				3,
				LocalDate.now().minusYears(2)
			)
		);

		var users = userRequests.stream()
			.filter(request -> request.age > 1)
			.map(request -> new User(
				request.name,
				request.age,
				request.birthday
			))
			.toList();

		System.out.println(users);

		// flatMap
		// 2차원 배열일 때 두 개의 배열을 하나의 배열로 합치는 것
		var numbers = List.of(
			List.of(1, 2, 3),
			List.of(4, 5, 6),
			List.of(7, 8, 9)
		);

		var flatMapNumbers = numbers.stream()
			.flatMap(Collection::stream)
			.toList();

		System.out.println(numbers);
		System.out.println(flatMapNumbers);

		// limit: 앞에서부터 N개만 가져옴
		var limitedNames = names.stream().limit(2).toList();
		System.out.println(limitedNames);

		// skip: 앞의 N개 건너뜀
		var skipNames = names.stream().skip(2).toList();
		System.out.println(skipNames);

		List<String> names1 = List.of("Bob", "Alice", "David", "Charlie", "Eve");

		// sorted 정렬
		var sortedNames = names1.stream().sorted().toList();
		System.out.println(sortedNames);

		var descNames = names1.stream()
			.sorted(Comparator.reverseOrder())
			.toList();
		System.out.println(descNames);

		var list1 = List.of(
			new Exam1(1),
			new Exam1(2),
			new Exam1(3),
			new Exam1(4),
			new Exam1(5)
		);

		var list2 = list1.stream()
			.sorted(Comparator.comparing(e -> e.id, Comparator.reverseOrder()))
			.toList();

		System.out.println("--------");
		System.out.println(list2);
		System.out.println("--------");

		names1.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);

		// distinct 중복 제거
		var duplicatedNames = List.of("Alice", "Bob", "Charlie", "Bob");
		var duplicatedNames1 = duplicatedNames.stream().distinct().toList();
		var duplicatedNames2 = duplicatedNames.stream().collect(Collectors.toSet());

		System.out.println(duplicatedNames1);
		System.out.println(duplicatedNames2);
	}
}
