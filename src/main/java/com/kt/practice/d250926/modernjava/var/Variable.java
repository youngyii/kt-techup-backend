package com.kt.practice.d250926.modernjava.var;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Variable {
	public static void main(String[] args) {
		// 자바 변수 생명주기 4단계
		// 1. 선언
		// 2. 초기화
		// 3. 할당
		// 4. 사용

		// 나: 기본형은 스택에 값 저장
		int a = 1; // 선언 + 초기화
		int b; // 선언 + 초기화 int인 기본 자료형의 초기값은 0
		b = 2; // 할당

		// 나: 참조형은 힙에 객체 참조값 저장
		Integer c; // 선언 + 초기화 Integer인 참조 자료형의 초기값은 null
		c = 4;

		// 앞뒤가 똑같아야한다. Type 변수명 = 값;
		// 롬복(Lombok)라이브러리에 val과 val이 구현되어있음 -> 자바 표준 문법은 아님.
		// var는 JDK 10에서 추가됨.
		ktCloudTechUpBackEndFirstTeam ktCloudTechUpBackEndFirstTeam = new ktCloudTechUpBackEndFirstTeam();
		var ktCloudTechUpBackEndFirstTeam2 = new ktCloudTechUpBackEndFirstTeam();
		ktCloudTechUpBackEndFirstTeam.teamName = "1팀";

		// 코틀린에서 val, var => 타입추론 + 가변성 제어
		// val(value): 재할당 불가(final과 같음)
		// var(variable): 재할당 가능
		// 자바는 val 지원 x

		List<ktCloudTechUpBackEndFirstTeam> list = new ArrayList<>();
		var list1 = new ArrayList<ktCloudTechUpBackEndFirstTeam>();
		HashMap<String, ktCloudTechUpBackEndFirstTeam> map = new HashMap<>();
		var map1 = new HashMap<String, ktCloudTechUpBackEndFirstTeam>();

		list.add(new ktCloudTechUpBackEndFirstTeam());
	}
}