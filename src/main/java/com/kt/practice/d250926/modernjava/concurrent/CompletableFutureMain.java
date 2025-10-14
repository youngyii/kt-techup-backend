package com.kt.practice.d250926.modernjava.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureMain {
	public static void main(String[] args) {
		// 비동기(Asynchronous): 순서와 상관없이 작업을 독립적으로 실행 가능(멀티 쓰레드)
		// 동기(Synchronous): 순서대로, 이전 작업 완료를 기다림

		// 비동기 작업을 실행할 쓰레드 풀(ThreadPool) 생성
		ExecutorService pool = Executors.newFixedThreadPool(4); // 최대 4개의 쓰레드 동시 실행 가능

		var feature1 = CompletableFuture.supplyAsync(() -> heavy(1), pool);
		var feature2 = CompletableFuture.supplyAsync(() -> heavy(2), pool);

		int sum = feature1.thenCombine(feature2, Integer::sum).join();
		// thenCombine(): 여러 비동기 작업 결과를 합침
		// join(): 결과를 가져올 때까지 기다림

		System.out.println("sum=" + sum);
	}

	static int heavy(int i) {
		try {
			Thread.sleep(3000); // 3초 대기
		} catch (InterruptedException ignored) {
		}
		return i * 10;
	}
}
