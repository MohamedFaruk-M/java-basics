/**
 * 
 */
package com.nisfa.main;

import com.nisfa.builder.StudentBuilder;
import com.nisfa.model.Student;

/**
 * @author NisfaYasam
 *
 */
public class ApplicationMain {

	/**
	 * @param args
	 */

	static int studentCount = 0;

	public static void main(String[] args) {

		System.out.println("Happy Learning");

		System.out.println("Stay Healthy & Be Optimist");

//		objects();

		objectArray();

		twoDimensionalArray();

	}

	static void objects() {
		System.out.println("---------Play around with Objects---------");

		System.out.println("\nInit Student:\n");

		Student student = StudentBuilder.getInstance().withId(1).withName("Rahul").withGender('M').withAge((byte) 27)
				.withPhoneNumber(999_444_7281L).build();

		printStudentDetails(student);

//		System.out.println("\nExploring Student #1:\n");
//
//		System.out.println("id: " + student.getId());
//		System.out.println("name: " + student.getName());
//		System.out.println("gender: " + student.getGender());
//		System.out.println("age: " + student.getAge());
//		System.out.println("phone: " + student.getPhoneNumber());
//
//		System.out.println("\nExplored Student #1:\n");

	}

	static void objectArray() {
		System.out.println("---------Lets explore object array----------");

		// case 1: init with fixed length
//		System.out.println("#### init with fixed length ####");
//		Student[] students = new Student[4];

//		students[0] = StudentBuilder.getInstance().withId(++studentCount).withName("Ravi").withGender('M')
//				.withAge((byte) 32).withPhoneNumber(999_444_7283L).build();
//		students[1] = StudentBuilder.getInstance().withId(++studentCount).withName("Rathinagiri").withGender('M')
//				.withAge((byte) 28).withPhoneNumber(999_444_7284L).build();
//		students[2] = StudentBuilder.getInstance().withId(++studentCount).withName("Subiksha").withGender('F')
//				.withAge((byte) 26).withPhoneNumber(999_444_7285L).build();
//		students[3] = StudentBuilder.getInstance().withId(++studentCount).withName("Roshini").withGender('F')
//				.withAge((byte) 35).withPhoneNumber(999_444_7286L).build();

		// case 2: init with fixed length along with instantiation
//		System.out.println("#### init with fixed length along with instantiation ####");
//		Student[] students = new Student[] {
//				StudentBuilder.getInstance().withId(++studentCount).withName("Ravi").withGender('M').withAge((byte) 32)
//						.withPhoneNumber(999_444_7283L).build(),
//				StudentBuilder.getInstance().withId(++studentCount).withName("Rathinagiri").withGender('M')
//						.withAge((byte) 28).withPhoneNumber(999_444_7284L).build(),
//				StudentBuilder.getInstance().withId(++studentCount).withName("Subiksha").withGender('F')
//						.withAge((byte) 26).withPhoneNumber(999_444_7285L).build(),
//				StudentBuilder.getInstance().withId(++studentCount).withName("Roshini").withGender('F')
//						.withAge((byte) 35).withPhoneNumber(999_444_7286L).build() };

		// case 3 : ease of initialization w/o new operator
		System.out.println("#### ease of initialization w/o new operator ####");

		Student[] students = {
				StudentBuilder.getInstance().withId(++studentCount).withName("Ravi").withGender('M').withAge((byte) 32)
						.withPhoneNumber(999_444_7283L).build(),
				StudentBuilder.getInstance().withId(++studentCount).withName("Rathinagiri").withGender('M')
						.withAge((byte) 28).withPhoneNumber(999_444_7284L).build(),
				StudentBuilder.getInstance().withId(++studentCount).withName("Subiksha").withGender('F')
						.withAge((byte) 26).withPhoneNumber(999_444_7285L).build(),
				StudentBuilder.getInstance().withId(++studentCount).withName("Roshini").withGender('F')
						.withAge((byte) 35).withPhoneNumber(999_444_7286L).build() };

		for (Student s : students) {
			printStudentDetails(s);
		}

	}

	static void printStudentDetails(Student student) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\nExploring Student #" + student.getId() + ":\n");

		System.out.println("id\t:" + student.getId());
		System.out.println("name\t:" + student.getName());
		System.out.println("gender\t:" + student.getGender());
		System.out.println("age\t:" + student.getAge());
		System.out.println("phone\t:" + student.getPhoneNumber());

		System.out.println("\nExplored Student #" + student.getId() + "\n");

	}

	static void twoDimensionalArray() {
		int[][] symmentricMax = { { 1 }, { 4, 16 }, { 7, 26, 41 }, { 4, 16, 26, 16 }, { 1, 4, 7, 4, 1 } };
		printSymmentricMax(symmentricMax, false);

		printSymmentricMax(symmentricMax, true);
	}

	static void printSymmentricMax(int[][] symMax, boolean printFulDuplex) {
		if (printFulDuplex)
			System.out.println("\n\n++------ Print Symmentric Matrix from its halfly filled array elements  --------++\n");
		else
			System.out.println("\n\n++------ Print Symmentric Matrix partially  --------++\n");

		for (int i = 0; i < symMax.length; ++i) {
			System.out.println();
			for (int j = 0; j < symMax[i].length; ++j) {
				if (j != 0)
					System.out.print("\t");
				if (printFulDuplex && j == symMax[i].length - 1)
					for (int k = j; k < symMax.length; ++k) {
						if (k != j)
							System.out.print("\t");
						System.out.print(symMax[k][i]);
					}
				else
					System.out.print(symMax[i][j]);
			}
		}

	}

}
