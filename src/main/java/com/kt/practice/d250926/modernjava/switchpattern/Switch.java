package com.kt.practice.d250926.modernjava.switchpattern;

public class Switch {
	public static void main(String[] args) {
		int day = 2;
		String dayString = null;
		// 기존의 Switch는 문법 -> 표현식으로 바뀜.
		switch (day) {
			case 1:
				dayString = "Monday";
				break;
			case 2:
				dayString = "Tuesday";
				break;
			case 3:
				dayString = "Wednesday";
				break;
			case 4:
				dayString = "Thursday";
				break;
		}
		System.out.println(dayString);

		String dayString2 = switch (day) {
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			default -> "Invalid day";
		};
		System.out.println(dayString2);
	}
}
