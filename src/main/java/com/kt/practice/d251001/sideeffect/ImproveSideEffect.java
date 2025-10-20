package com.kt.practice.d251001.sideeffect;

import java.util.Arrays;

public class ImproveSideEffect {
	public static class Customer {
		Grade grade;
		int appleCount;
		int bananaCount;

		public Customer(Grade grade) {
			this.grade = grade;
		}
	}

	public enum Grade {
		BASIC, // 할인율 10%
		SILVER // 할인율 20%
	}

	// 개선1. final -> 외부에서 수정 불가
	final static public int APPLE_PRICE = 1_000;
	final static public int BANANA_PRICE = 1_200;

	// 개선2. 공통 사용 기능 함수화 - 등급별 할인율
	static double discountFactor(Grade grade) {
		// 개선3. enum 활용으로 switch문 미처리 -> 컴파일 에러
		// Grade 추가 시, 수정 안하면 컴파일 에러 발생
		return switch (grade) {
			case BASIC -> 0.9f;
			case SILVER -> 0.8f;
		};
	}

	static double getApplePrice(Grade grade) {
		return APPLE_PRICE * discountFactor(grade);
	}

	static double getBananaPrice(Grade grade) {
		return BANANA_PRICE * discountFactor(grade);
	}

	static double salePolicy(int count) {
		if (count >= 5) {
			return 0.9;
		} else {
			return 1.0;
		}
	}

	public static void main(String[] args) {
		System.out.printf("사과 가격(기본등급): %.2f%n", getApplePrice(Grade.BASIC));
		System.out.printf("사과 가격(실버등급): %.2f%n", getApplePrice(Grade.SILVER));
		System.out.printf("바나나 가격(기본등급): %.2f%n", getBananaPrice(Grade.BASIC));
		System.out.printf("바나나 가격(실버등급): %.2f%n", getBananaPrice(Grade.SILVER));

		Customer customer1 = new Customer(Grade.BASIC);
		customer1.appleCount = 5;
		customer1.bananaCount = 2;

		Customer customer2 = new Customer(Grade.SILVER);
		customer2.appleCount = 3;
		customer2.bananaCount = 3;

		Customer[] customers = {customer1, customer2};

		// 개선4. 외부 변수 변경 없이 Stream API 활용하여 처리
		// 개선5. customers 내부 값만 사용하고, 변경 X
		// for, if 코드 블럭 제거, 할인 정책 함수화
		final double appleTotal = Arrays.stream(customers)
			.mapToDouble(count ->
				getApplePrice(count.grade) * count.appleCount * salePolicy(count.appleCount))
			.sum();

		final double bannaTotal = Arrays.stream(customers)
			.mapToDouble(count ->
				getBananaPrice(count.grade) * count.bananaCount * salePolicy(count.bananaCount))
			.sum();

		System.out.printf("총 매출: %.2f%n", (bannaTotal + appleTotal));

		final double total = Arrays.stream(customers)
			.mapToDouble(c ->
				getApplePrice(c.grade) * c.appleCount * salePolicy(c.appleCount) // 사과
					+ getBananaPrice(c.grade) * c.bananaCount * salePolicy(c.bananaCount) // 바나나
			)
			.sum();

		System.out.printf("총 매출: %.2f%n", total);
	}
}
