package com.kt.practice.d250925.immutable.thread.mutable;

// 나: 가변 객체(Mutable Object)를 멀티스레드에서 공유하면 어떤 문제가 생기는가?
// 하나의 mutablePoint 객체를 3개의 스레드가 동시에 수정
// 경쟁 조건(Race Condition) 발생: 여러 스레드가 같은 자원을 동시에 사용·수정하려고 경쟁하는 상황
// 프로그램 실행 결과가 예측 불가능해짐
public class UnThreadSafe {
	public static void main(String[] args) {
		MutablePoint mutablePoint = new MutablePoint(1, 2);

		new Thread(() -> {
			for (int i = 0; i < 100_000; i++) {
				// 나: x++는 원자적이지 않아서 다른 스레드가 중간에 끼어들어 값이 꼬일 수 있음.
				// x값을 읽고 -> x+1 계산 -> 계산값 x에 저장
				// x, y 값 불일치
				mutablePoint.x++;
				mutablePoint.y++;
				String msg = mutablePoint.x + "," + mutablePoint.y;
				System.out.println("일꾼1 " + msg);
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 100_000; i++) {
				mutablePoint.x++;
				mutablePoint.y++;
				String msg = mutablePoint.x + "," + mutablePoint.y;
				System.out.println("일꾼2 " + msg);
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 100_000; i++) {
				mutablePoint.x++;
				mutablePoint.y++;
				String msg = mutablePoint.x + "," + mutablePoint.y;
				System.out.println("일꾼3 " + msg);
			}
		}).start();
	}
}
