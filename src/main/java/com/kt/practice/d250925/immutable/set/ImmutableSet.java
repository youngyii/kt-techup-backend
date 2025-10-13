package com.kt.practice.d250925.immutable.set;

import java.util.HashSet;
import java.util.Set;

public class ImmutableSet {
	public static void main(String[] args) {
		// 나: final 키워드 ≠ 불변
		// numbers 참조 변수는 final -> 다른 Set으로 변경 불가
		// 내부 값은 여전히 가변
		final Set<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);

		// Set.of : 불변 Set 생성
		// 내부 상태 바뀌지 않음
		Set<Integer> unmodifiableSet = Set.of(1, 2);

		//unmodifiableSet.add(3); // UnsupportedOperationException 발생

		System.out.println(numbers);
		System.out.println(unmodifiableSet);
	}
}
