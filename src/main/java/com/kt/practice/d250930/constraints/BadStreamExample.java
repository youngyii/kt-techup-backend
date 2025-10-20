package com.kt.practice.d250930.constraints;

import java.util.List;

// 2. 런타임 제약 (실행중인 코드에서 동작 제약)
// Stream - 개선 필요한 코드
public class BadStreamExample {
	public static class Item {
		String name;
		int price;
		int count;

		public Item(String name, int price, int count) {
			this.name = name;
			this.price = price;
			this.count = count;
		}
	}

	public static void main(String[] args) {
		List<Item> items = List.of(
			new Item("apple", 1000, 5),
			new Item("banana", 1200, 3),
			new Item("orange", 800, 7)
		);

		// 총합 구하기
		// orange는 제외하기
		double total = 0;
		for (Item it : items) {
			// orange 제외, if문 위치에 따라 불필요한 연산이 발생할 수 있음
			if (it.name.equals("orange")) {
				continue;
			}

			// 사이드 이펙트 발생 가능
			double totalForItem = it.price * it.count;

			// 5개 이상 구매 10% 할인
			if (it.count >= 5) {
				totalForItem = totalForItem * 0.9;
			}

			total += totalForItem;
		}
		System.out.println("총합 = " + total);
	}
}