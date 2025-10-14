package com.kt.practice.d250926.lambda;

public class LambdaMain {
	public static void main(String[] args) {
		// 람다식 () -> {}
		// () -> { system.out.println("Hello Lambda") };
		// () -> system.out.println("Hello Lambda");
		// () -> { return "Hello Lambda"; };
		// () -> "Hello Lambda";

		// 익명 클래스 사용 장점: 클래스 파일 안 만들어도 됨
		AddInterface addFunctionBasic = new AddInterface() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		// 람다식 사용 장점: 간결
		AddInterface addFunctionLambda = (a, b) -> a + b;
		addFunctionLambda.add(10, 20);

		AddInterface methodRef = Integer::sum; // 메서드 참조

		System.out.println(addFunctionLambda.add(10, 20));
		System.out.println(methodRef.add(10, 20));
	}
}
