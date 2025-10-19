package com.kt.practice.d250929.stream;

public class Exam {
	String name;
	int score;
	boolean isPass;

	public Exam(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Exam{" +
			"name='" + name + '\'' +
			", score=" + score +
			", isPass=" + isPass +
			'}';
	}
}
