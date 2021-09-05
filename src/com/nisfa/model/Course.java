package com.nisfa.model;

import java.io.Serializable;

public class Course implements Serializable {

	private static final long serialVersionUID = 5076222711825819549L;

	private String name;
	private int score;
	private char grade;

	public Course() {

	}

	public Course(String name, int score, char grade) {
		super();
		this.name = name;
		this.score = score;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", score=" + score + ", grade=" + grade + "]";
	}

}
