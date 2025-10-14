package com.kt.practice.d250926.modernjava.timeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Date;

public class TimeAPI {
	public static void main(String[] args) {
		// jdk 7까지
		// java.util.Date : 불변 아님 -> 멀티스레드 환경에서 위험
		// java.util.Calender : API 복잡, 가독성 낮음
		Date date = new Date();
		System.out.println(date);

		// jdk 8+
		// yyyy-mm-dd hh:mm:ss
		// 2024-06-20 14:30:00

		// LocalDate, LocalTime, LocalDateTime
		// ZonedDateTime, OffsetDateTime
		// Instant
		// Period, Duration

		// UTC - KST - 9시간 시차
		// yyyy-mm-dd hh:mm:ss -> 현지시간
		// yyyy-mm-dd hh:mm:ssZ -> UTC
		// yyyy-mm-dd hh:mm:ss+09 -> Offset (UTC로부터 몇 시간 차이나는 시간대)

		Instant instant = Instant.now(); // 순간(UTC 기반 절대 시점) 끝에 'Z'
		System.out.println(instant);     // 2025-10-13T13:38:10.829552400Z

		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDate);     // 2025-10-13
		System.out.println(localTime);     // 22:55:14.137098
		System.out.println(localDateTime); // 2025-10-13T22:55:14.137098

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		OffsetDateTime offsetTime = OffsetDateTime.now();
		System.out.println(zonedDateTime); // 2025-10-13T22:55:14.138140200+09:00[Asia/Seoul]
		System.out.println(offsetTime);    // 2025-10-13T22:55:14.138140200+09:00

		Duration duration = Duration.ofHours(1); // 시간 단위 차이
		System.out.println(duration);            // PT1H = Period of Time 1 Hour

		LocalDate start = LocalDate.of(2024, 1, 1);
		LocalDate end = LocalDate.of(2025, 10, 13);
		Period period = Period.between(start, end); // 날짜 단위 차이
		System.out.println(period);                // P1Y9M12D
	}
}