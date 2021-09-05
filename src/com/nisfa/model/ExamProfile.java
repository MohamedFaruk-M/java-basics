package com.nisfa.model;

import java.io.Serializable;

public class ExamProfile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2905731132681231052L;

	private Student student;
	private Course course;

	public ExamProfile(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "ExamProfile [student=" + student + ", course=" + course + "]";
	}

}
