package com.kt.practice.d250925.immutable.thread.immutable;

// 값 항상 동일
public class ThreadSafe {
	public static void main(String[] args) {
		Point immutablePoint = new Point(1, 2);

		new Thread(() -> {
			for (int i = 0; i < 100_000; i++) {
				String msg = immutablePoint.x + "," + immutablePoint.y;
				System.out.println("일꾼1 " + msg);
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 100_000; i++) {
				String msg = immutablePoint.x + "," + immutablePoint.y;
				System.out.println("일꾼2 " + msg);
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 100_000; i++) {
				String msg = immutablePoint.x + "," + immutablePoint.y;
				System.out.println("일꾼3 " + msg);
			}
		}).start();
	}
}
