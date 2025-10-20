package com.kt.practice.d250930.constraints;

import java.util.Random;

// 2. 런타임 제약 (실행중인 코드에서 동작 제약)
// try-catch 안 좋은 예시
public class BadTryCatch {
	public void throwsException_A() throws Exception {
		Random random = new Random();
		boolean flag = random.nextBoolean();
		if (flag) {
			throw new Exception("예외가 발생했습니다.");
		}
	}

	public void throwsException_B() throws Exception {
		Random random = new Random();
		boolean flag = random.nextBoolean();
		if (flag) {
			throw new Exception("예외가 발생했습니다.");
		}
	}

	public void throwsException_C() throws Exception {
		Random random = new Random();
		boolean flag = random.nextBoolean();
		if (flag) {
			throw new Exception("예외가 발생했습니다.");
		}
	}

	public static void main(String[] args) {
		BadTryCatch badTryCatch = new BadTryCatch();

		// 세 메서드 중 하나라도 예외를 던지면 try 블록이 즉시 중단되고 catch 블록으로 넘어감
		try {
			badTryCatch.throwsException_A();
			badTryCatch.throwsException_B();
			badTryCatch.throwsException_C();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
