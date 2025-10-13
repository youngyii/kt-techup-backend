package com.kt.practice.d250925.immutable;

public class Immutable {
	// immutable: 불변의, 변경할 수 없는
	// mutable: 변경할 수 있는

	// 변경이라는 것은 변화하는 것

	public static void main(String[] args) {
		int a = 1;
		// 5000줄의 코드
		a = 2;
		// 5000줄의 코드
		System.out.println(a);

		// 나: int 같은 기본형 변수는 값이 자유롭게 변경 가능: mutable
		// 값이 언제 바뀌었는지 추적 어려움. 예측 불가
	}
}