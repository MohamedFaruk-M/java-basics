
package com.nisfa.model;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 524002403937674871L;

	private int id;
	private String name;

	private char gender;
	private byte age;

	private long phoneNumber;

	public Student() {
	}

	public Student(int id, String name, char gender, byte age, long phoneNumber) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	// commented after implemented student builder
	/*
	 * public static Student builder(){ return new Student(); }
	 * 
	 * public void withId(int id) { this.id = id; }
	 * 
	 * public void withName(String name) { this.name = name; }
	 * 
	 * public void withGender(char gender) { this.gender = gender; }
	 * 
	 * public void withAge(byte age) { this.age = age; }
	 * 
	 * public void withPhoneNumber(long phoneNumber) { this.phoneNumber =
	 * phoneNumber; }
	 */

	// builder using static inner class
	// final hence never been inherited
	public static final class Builder {

		private int id;
		private String name;

		private char gender;
		private byte age;

		private long phoneNumber;

		public Builder withId(int id) {
			this.id = id;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withGender(char gender) {
			this.gender = gender;
			return this;
		}

		public Builder withAge(byte age) {
			this.age = age;
			return this;
		}

		public Builder withPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public Student build() {
			return new Student(id, name, gender, age, phoneNumber);
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public byte getAge() {
		return age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", phoneNumber="
				+ phoneNumber + "]";
	}
}