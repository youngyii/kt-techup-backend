package com.kt.practice.d250925.immutable.atomic;

public class Money {
	final int amount; // 금액 필드, 불변

	public Money(int amount) { // 생성자
		this.amount = amount;
	}

	public int amount() { // getter
		return amount;
	}

	// amount : 1000
	// targetAmount : 2000
	// 1000 - 2000 = -1000
	public Money minus(int targetAmount) { // 금액 차감 메서드
		if (this.amount < targetAmount) {
			throw new IllegalArgumentException("잔액이 부족합니다.");
		}
		return new Money(this.amount - targetAmount); // 새 객체 반환
	}

	@Override
	public String toString() {
		return "Money(" + amount + ")";
	}
}
