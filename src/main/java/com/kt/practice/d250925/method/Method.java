package com.kt.practice.d250925.method;

import java.util.Map;

public class Method {
	public static void main(String[] args) {
		// Method 함수 => 심부름 => 메시지

		// 인자 = 파라미터 = parameter = 매개변수 => 엄마의 요구 조건을 전달하는 창구
		// 리턴 => 요구조건을 수행하고 엄마에게 결과를 전달함

		Map<String, String> 오른쪽주머니 = 심부름("사과", 10_000);

		System.out.println("사온 물건 : " + 오른쪽주머니.get("product"));
		System.out.println("잔돈 : " + 오른쪽주머니.get("change"));
		System.out.println("엄마 : " + 오른쪽주머니.get("product") + " 잘 사왔네~");
		System.out.println("--------------------");

		Map<String, String> 왼쪽주머니 = 심부름("바나나", 20_000);

		System.out.println("사온 물건 : " + 왼쪽주머니.get("product"));
		System.out.println("잔돈 : " + 왼쪽주머니.get("change"));
		System.out.println("엄마 : " + 왼쪽주머니.get("product") + " 잘 사왔네~");
	}

	public static Map<String, String> 심부름(String product, int money) {
		// 사과: 받은 10000원, 바나나: 받은 20000원
		// 사과: 5000원, 바나나: 7000원
		// 내 과자: 500원

		// if = 만약에
		// 만약에 사과면 5000원을 빼고
		// 만약에 바나나면 7000원을 뺀다

		int change = 0;
		if (product.equals("사과")) {
			change = money - 5000;
		} else {
			change = money - 7000;
		}
		change = change - 500;

		System.out.println("돈 " + money + "원 줄테니까 요 앞에 마트 가서 " + product + " 한 팩 사와");
		System.out.println("남는 돈으로 과자도 하나 사오렴");
		System.out.println("아주머니한테 인사 잘하고 횡단보도 건널 때 차 조심하고");
		System.out.println("알았지? 다녀와~");

		System.out.println("잔돈: " + change + "원 받았다~");

		return Map.of(
			"product", product,
			"change", change + "원"
		);
	}
	// 1. 객체에 래핑(포장)해서 리턴하는 방식
	// 2. Map -> Key, Value로 이루어진 자료구조
	// 3. Set, List -> 배열이니 인덱스를 약속 0:프로덕트, 1:잔돈
	// 4. Pair -> Tuple
}

