package com.kt.practice.d251013.solid;

public class SlackService implements NotificationService {
	@Override
	public void send(String message) {
		System.out.println("Slack 메시지 전송: " + message);
	}
}
