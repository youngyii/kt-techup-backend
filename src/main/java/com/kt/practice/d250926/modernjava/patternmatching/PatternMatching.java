package com.kt.practice.d250926.modernjava.patternmatching;

public class PatternMatching {
	public static void main(String[] args) {
		Object obj = "Hello, kt Cloud Tech Up Back-End First Team!";

		if (obj instanceof String s) { // 패턴 매칭 방식: obj가 String이면 자동으로 변수 s에 할당
			// String s = (String) obj; // 기존 방식: 형변환(cast) 해줘야 함
			System.out.println("String length: " + s.length());
		} else {
			System.out.println("Not a String");
		}

		// 사람 - 이름 나이 주소 주민번호
		// 학생 - 학년 반 번호
		// 선생님 - 학년 반 번호 직급 담당과목
		// 관리자 - 부서 직급

		// 기존에는 instanceof + 캐스팅을 반복해야 했지만,
		// 패턴 매칭을 사용하면 간결하게 타입 검사 + 변수 선언 가능
	}
}
