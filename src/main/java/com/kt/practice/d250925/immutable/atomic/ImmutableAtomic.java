package com.kt.practice.d250925.immutable.atomic;

public class ImmutableAtomic {
	// 어떤 객체를 만들고 오류를 내보고 실패 원자성이 보장되는가?
	// 나: 예외 발생해도 원래 객체는 절대 변하지 않음
	// 실패 원자성: 연산이 실패하면 기존 상태는 그대로 유지되는 성질
	public static void main(String[] args) {
		Money money1 = new Money(10_000);

		System.out.println("money1 = " + money1);

		try {
			// money1.minus(20_000);
			Money changeMoney = money1.minus(15_000);

			System.out.println("changeMoney = " + changeMoney);
		} catch (IllegalArgumentException e) {
			// 비정상적일 때 작동하길 기대하는 코드
			System.out.println(e.getMessage());
		}

		System.out.println("money1 = " + money1); // 5_000원
	}
}
