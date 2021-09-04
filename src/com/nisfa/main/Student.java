
package com.nisfa.main;

public class Student {
	
	private int id;
	private String name;
	
	private char gender;
	private byte age;
	
	private long phoneNumber;
	
	public Student() {}
	
	public Student(int id, String name, char gender, byte age, long phoneNumber) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	//commented after implemented student builder
	/*
	public static Student builder(){
		return new Student();
	}
	
	public void withId(int id) {
		this.id = id;
	}
	
	public void withName(String name) {
		this.name = name;
	}
	
	public void withGender(char gender) {
		this.gender = gender;
	}
	
	public void withAge(byte age) {
		this.age = age;
	}
	
	public void withPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}*/
	
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
}