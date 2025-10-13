package com.kt.practice.d250925.immutable.thread.immutable;

public class Point {
	/*
	Point immutablePoint = new Point(1, 2);
	immutablePoint.x = 3; // Point는 final 필드이므로 컴파일 에러 발생
	immutablePoint.y = 4;
	*/

	final int x;
	final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}