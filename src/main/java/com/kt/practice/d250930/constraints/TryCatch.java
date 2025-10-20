package com.kt.practice.d250930.constraints;

import java.util.Random;

// 2. 런타임 제약 (실행중인 코드에서 동작 제약)
// try-catch 개선 코드
public class TryCatch {
	public void throwsException_A() throws Exception {
		Random random = new Random();
		boolean flag = random.nextBoolean();
		if (flag) {
			// 로그 개선
			throw new Exception("A 예외가 발생했습니다.");
		}
	}

	public void throwsException_B() throws Exception {
		Random random = new Random();
		boolean flag = random.nextBoolean();
		if (flag) {
			// 로그 개선
			throw new Exception("B 예외가 발생했습니다.");
		}
	}

	public void throwsException_C() throws Exception {
		Random random = new Random();
		boolean flag = random.nextBoolean();
		if (flag) {
			// 로그 개선
			throw new Exception("C 예외가 발생했습니다.");
		}
	}

	public static void main(String[] args) {
		TryCatch tryCatch = new TryCatch();

		// 예외처리 세분화
		try {
			tryCatch.throwsException_A();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//return; // 필요 시 메서드 종료
		}

		try {
			tryCatch.throwsException_B();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//return; // 필요 시 메서드 종료
		}

		try {
			tryCatch.throwsException_C();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//return; // 필요 시 메서드 종료
		}
	}
}
