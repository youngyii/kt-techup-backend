package com.kt.practice.d250926.modernjava.textblocks;

public class TextBlocks {
	public static void main(String[] args) {
		// jdk15 이상에서 사용 가능
		// 여러 줄의 문자열을 쉽게 작성할 수 있는 기능
		String query = "SELECT u.id, u.name, u.email\n" +
			"FROM users u\n" +
			"WHERE u.status = 'active'\n" +
			"ORDER BY u.created at DESC;";

		// Text Block 깔끔
		String query2 = """
			SELECT u.id, u.name, u.email
			FROM users u
			WHERE u.status = 'active'
			ORDER BY u.created at DESC;
			""";
	}
	/**
	 * SELECT u.id, u.name, u.email
	 * FROM users u
	 * WHERE u.status = 'active'
	 * ORDER BY u.created = at DESC
	 */
}
