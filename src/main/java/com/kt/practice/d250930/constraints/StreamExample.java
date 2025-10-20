package com.kt.practice.d250930.constraints;

import java.util.List;

// 2. 런타임 제약 (실행중인 코드에서 동작 제약)
// Stream - 개선 코드
public class StreamExample {
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

	static double getPrice(Item it) {
		double line = it.price * it.count;
		return (it.count >= 5) ? line * 0.9 : line;
	}

	public static void main(String[] args) {
		List<Item> items = List.of(
			new Item("apple", 1000, 5),
			new Item("banana", 1200, 3),
			new Item("orange", 800, 7)
		);

		double total = items.stream()
			.filter(it -> !it.name.equals("orange"))
			.mapToDouble(StreamExample::getPrice)
			.sum();

		System.out.println("총합 = " + total);
	}
}
