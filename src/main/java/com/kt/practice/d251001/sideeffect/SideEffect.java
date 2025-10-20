package com.kt.practice.d251001.sideeffect;

public class SideEffect {
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

	// 문제점1. 전역 변수 값 변경 가능
	// 직접적인 사이드 이펙트가 발생하는 코드 (변경 가능성 있음)
	static public int applePrice = 1_000;
	static public int bananaPrice = 1_200;

	static double getApplePrice(Grade grade) {
		// 문제점2. 간접적인 사이드 이펙트가 발생하는 코드 ( 중복 로직, 하드코딩 )
		// 등급 추가, 할인율 변경 시 코드 변경 필요
		// => 유지보수 어려움, 버그 발생 가능성 증가
		float discountPct = 0;

		if (grade == Grade.BASIC) {
			discountPct = 0.9f;
		} else if (grade == Grade.SILVER) {
			discountPct = 0.8f;
		}

		// applePrice 변경 가능
		return applePrice * discountPct;
	}

	static double getBananaPrice(Grade grade) {
		// 간접적인 사이드 이펙트가 발생하는 코드 ( 중복 로직, 하드코딩 )
		// 등급 추가, 할인율 변경 시 코드 변경 필요
		// => 유지보수 어려움, 버그 발생 가능성 증가
		float discountPct = 0;

		if (grade == Grade.SILVER) {
			discountPct = 0.8f;
		} else if (grade == Grade.BASIC) {
			discountPct = 0.9f;
		}

		// bananaPrice 변경 가능
		return bananaPrice * discountPct;
	}

	public static void main(String[] args) {
		System.out.println("사과 가격(기본등급): " + getApplePrice(Grade.BASIC));
		System.out.println("사과 가격(실버등급): " + getApplePrice(Grade.SILVER));
		System.out.println("바나나 가격(기본등급): " + getBananaPrice(Grade.BASIC));
		System.out.println("바나나 가격(실버등급): " + getBananaPrice(Grade.SILVER));

		Customer customer1 = new Customer(Grade.BASIC);
		customer1.appleCount = 5;
		customer1.bananaCount = 2;

		Customer customer2 = new Customer(Grade.SILVER);
		customer2.appleCount = 3;
		customer2.bananaCount = 3;

		Customer[] customers = {customer1, customer2};

		// 사이드 이펙트 발생 가능한 코드
		float total = 0;

		for (Customer customer : customers) {
			float customerTotal = 0;

			// 5개 이상 구매 시, 10% 추가 할인
			if (customer.appleCount >= 5) {
				customerTotal += getApplePrice(customer.grade) * customer.appleCount * 0.9;
			}

			// 5개 이상 구매 시, 10% 추가 할인
			if (customer.bananaCount >= 5) {
				customerTotal += getBananaPrice(customer.grade) * customer.bananaCount * 0.9;
			}

			// 문제점3. 외부 변수를 반복문 내부에서 계속 변경 -> 예측 불가
			total += customerTotal;

			// 문제점4. 조건문 내 누락 로직
			// 조건 미충족 시 계산 자체가 생략되어 매출 누락
		}

		System.out.println("총 매출: " + total);
	}
}