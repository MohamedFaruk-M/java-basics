
package com.nisfa.builder;

import java.io.Serializable;

import com.nisfa.model.Student;

public class StudentBuilder implements Serializable {

	private static final long serialVersionUID = -2726927396806668369L;

	private int id;
	private String name;

	private char gender;
	private byte age;

	private long phoneNumber;

	public static StudentBuilder getInstance() {
		return new StudentBuilder();
	}

	public StudentBuilder withId(int id) {
		this.id = id;
		return this;
	}

	public StudentBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public StudentBuilder withGender(char gender) {
		this.gender = gender;
		return this;
	}

	public StudentBuilder withAge(byte age) {
		this.age = age;
		return this;
	}

	public StudentBuilder withPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public Student build() {
		return new Student(id, name, gender, age, phoneNumber);
	}
}