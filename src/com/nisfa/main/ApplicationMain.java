/**
 * 
 */
package com.nisfa.main;

import com.nisfa.builder.StudentBuilder;

/**
 * @author NisfaYasam
 *
 */
public class ApplicationMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Happy Learning");

		System.out.println("Stay Healthy & Be Optimist");

		objects();

	}

	static void objects() {
		System.out.println("---------Play around with Objects---------");

		System.out.println("\nInit Student:\n");

		Student student = StudentBuilder.getInstance().withId(1).withName("Rahul").withGender('M').withAge((byte) 27)
				.withPhoneNumber(999_444_7281L).build();

		System.out.println("\nExploring Student #1:\n");

		System.out.println("id: " + student.getId());
		System.out.println("name: " + student.getName());
		System.out.println("gender: " + student.getGender());
		System.out.println("age: " + student.getAge());
		System.out.println("phone: " + student.getPhoneNumber());

		System.out.println("\nExplored Student #1:\n");

	}

}
