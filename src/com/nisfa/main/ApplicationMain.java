
package com.nisfa.main;

import com.nisfa.builder.StudentBuilder;
import com.nisfa.learn.basic.BoxedPrimitive;
import com.nisfa.learn.basic.StringPool;
import com.nisfa.learn.basic.Variable;
import com.nisfa.model.Student;
import com.nisfa.util.DistanceUnit;

/**
 * @author NisfaYasam
 *
 */
public class ApplicationMain {

	static int studentCount = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Happy Learning");

		System.out.println("Stay Healthy & Be Optimist");

		lrnVariable();

//		objects();

//		objectArray();

//		twoDimensionalArray();
		
//		unitConverter(0.2);

		lrnString();

//		lrnBoxedPrimitives();
	}

	/**
	 * time to learn some edge cases on variable
	 * <p>
	 *     type casting over the window range
	 * </p>
	 */
	static void lrnVariable() {

		Variable lrnCasting = new Variable();
		lrnCasting.typeCastingByteOverRange();

	}

	static void objects() {
		System.out.println("---------Play around with Objects---------");

		System.out.println("\nInit Student:\n");

		Student student = StudentBuilder.getInstance().withId(1).withName("Rahul").withGender('M').withAge((byte) 27)
				.withPhoneNumber(999_444_7281L).build();

		// instantiated by builder class (static inner class)
//		Student student = Student.Builder.withId(1).withName("Rahul").withGender('M').withAge((byte) 27)
//				.withPhoneNumber(999_444_7281L).build();

		
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
	
	static void unitConverter(double d) {
		System.out.println("\n---------- World of Trade Market in which conversion plays crucially role ----------\n");
		

		System.out.println(d + " NanoMeter in MicroMeter\t: " + DistanceUnit.MicroMeter.convert(d, DistanceUnit.NanoMeter));
		System.out.println(d + " NanoMeter in MilliMeter\t: " + DistanceUnit.MilliMeter.convert(d, DistanceUnit.NanoMeter));
		System.out.println(d + " NanoMeter in CentiMeter\t: " + DistanceUnit.CentiMeter.convert(d, DistanceUnit.NanoMeter));
		System.out.println(d + " NanoMeter in DeciMeter\t: " + DistanceUnit.DeciMeter.convert(d, DistanceUnit.NanoMeter));
		System.out.println(d + " NanoMeter in Meter\t: " + DistanceUnit.Meter.convert(d, DistanceUnit.NanoMeter));
		System.out.println(d + " NanoMeter in DecaMeter\t: " + DistanceUnit.DecaMeter.convert(d, DistanceUnit.NanoMeter));
		System.out.println(d + " NanoMeter in HectaMeter\t: " + DistanceUnit.HectaMeter.convert(d, DistanceUnit.NanoMeter));
		System.out.println(d + " NanoMeter in KiloMeter\t: " + DistanceUnit.KiloMeter.convert(d, DistanceUnit.NanoMeter));
		System.out.println(d + " NanoMeter in Mile\t: " + DistanceUnit.Mile.convert(d, DistanceUnit.NanoMeter));
		System.out.println("\n" + d + " MicroMeter in NanoMeter\t: " + DistanceUnit.NanoMeter.convert(d, DistanceUnit.MicroMeter));

		System.out.println(d + " MicroMeter in MilliMeter\t: " + DistanceUnit.MilliMeter.convert(d, DistanceUnit.MicroMeter));
		System.out.println(d + " MicroMeter in CentiMeter\t: " + DistanceUnit.CentiMeter.convert(d, DistanceUnit.MicroMeter));
		System.out.println(d + " MicroMeter in DeciMeter\t: " + DistanceUnit.DeciMeter.convert(d, DistanceUnit.MicroMeter));
		System.out.println(d + " MicroMeter in Meter\t: " + DistanceUnit.Meter.convert(d, DistanceUnit.MicroMeter));
		System.out.println(d + " MicroMeter in DecaMeter\t: " + DistanceUnit.DecaMeter.convert(d, DistanceUnit.MicroMeter));
		System.out.println(d + " MicroMeter in HectaMeter\t: " + DistanceUnit.HectaMeter.convert(d, DistanceUnit.MicroMeter));
		System.out.println(d + " MicroMeter in KiloMeter\t: " + DistanceUnit.KiloMeter.convert(d, DistanceUnit.MicroMeter));
		System.out.println(d + " MicroMeter in Mile\t: " + DistanceUnit.Mile.convert(d, DistanceUnit.MicroMeter));
		System.out.println("\n" + d + " MilliMeter in NanoMeter\t: " + DistanceUnit.NanoMeter.convert(d, DistanceUnit.MilliMeter));
		System.out.println(d + " MilliMeter in MicroMeter\t: " + DistanceUnit.MicroMeter.convert(d, DistanceUnit.MilliMeter));

		System.out.println(d + " MilliMeter in CentiMeter\t: " + DistanceUnit.CentiMeter.convert(d, DistanceUnit.MilliMeter));
		System.out.println(d + " MilliMeter in DeciMeter\t: " + DistanceUnit.DeciMeter.convert(d, DistanceUnit.MilliMeter));
		System.out.println(d + " MilliMeter in Meter\t: " + DistanceUnit.Meter.convert(d, DistanceUnit.MilliMeter));
		System.out.println(d + " MilliMeter in DecaMeter\t: " + DistanceUnit.DecaMeter.convert(d, DistanceUnit.MilliMeter));
		System.out.println(d + " MilliMeter in HectaMeter\t: " + DistanceUnit.HectaMeter.convert(d, DistanceUnit.MilliMeter));
		System.out.println(d + " MilliMeter in KiloMeter\t: " + DistanceUnit.KiloMeter.convert(d, DistanceUnit.MilliMeter));
		System.out.println(d + " MilliMeter in Mile\t: " + DistanceUnit.Mile.convert(d, DistanceUnit.MilliMeter));
		System.out.println("\n" + d + " CentiMeter in NanoMeter\t: " + DistanceUnit.NanoMeter.convert(d, DistanceUnit.CentiMeter));
		System.out.println(d + " CentiMeter in MicroMeter\t: " + DistanceUnit.MicroMeter.convert(d, DistanceUnit.CentiMeter));
		System.out.println(d + " CentiMeter in MilliMeter\t: " + DistanceUnit.MilliMeter.convert(d, DistanceUnit.CentiMeter));

		System.out.println(d + " CentiMeter in DeciMeter\t: " + DistanceUnit.DeciMeter.convert(d, DistanceUnit.CentiMeter));
		System.out.println(d + " CentiMeter in Meter\t: " + DistanceUnit.Meter.convert(d, DistanceUnit.CentiMeter));
		System.out.println(d + " CentiMeter in DecaMeter\t: " + DistanceUnit.DecaMeter.convert(d, DistanceUnit.CentiMeter));
		System.out.println(d + " CentiMeter in HectaMeter\t: " + DistanceUnit.HectaMeter.convert(d, DistanceUnit.CentiMeter));
		System.out.println(d + " CentiMeter in KiloMeter\t: " + DistanceUnit.KiloMeter.convert(d, DistanceUnit.CentiMeter));
		System.out.println(d + " CentiMeter in Mile\t: " + DistanceUnit.Mile.convert(d, DistanceUnit.CentiMeter));
		System.out.println("\n" + d + " DeciMeter in NanoMeter\t: " + DistanceUnit.NanoMeter.convert(d, DistanceUnit.DeciMeter));
		System.out.println(d + " DeciMeter in MicroMeter\t: " + DistanceUnit.MicroMeter.convert(d, DistanceUnit.DeciMeter));
		System.out.println(d + " DeciMeter in MilliMeter\t: " + DistanceUnit.MilliMeter.convert(d, DistanceUnit.DeciMeter));
		System.out.println(d + " DeciMeter in CentiMeter\t: " + DistanceUnit.CentiMeter.convert(d, DistanceUnit.DeciMeter));

		System.out.println(d + " DeciMeter in Meter\t: " + DistanceUnit.Meter.convert(d, DistanceUnit.DeciMeter));
		System.out.println(d + " DeciMeter in DecaMeter\t: " + DistanceUnit.DecaMeter.convert(d, DistanceUnit.DeciMeter));
		System.out.println(d + " DeciMeter in HectaMeter\t: " + DistanceUnit.HectaMeter.convert(d, DistanceUnit.DeciMeter));
		System.out.println(d + " DeciMeter in KiloMeter\t: " + DistanceUnit.KiloMeter.convert(d, DistanceUnit.DeciMeter));
		System.out.println(d + " DeciMeter in Mile\t: " + DistanceUnit.Mile.convert(d, DistanceUnit.DeciMeter));
		System.out.println("\n" + d + " Meter in NanoMeter\t: " + DistanceUnit.NanoMeter.convert(d, DistanceUnit.Meter));
		System.out.println(d + " Meter in MicroMeter\t: " + DistanceUnit.MicroMeter.convert(d, DistanceUnit.Meter));
		System.out.println(d + " Meter in MilliMeter\t: " + DistanceUnit.MilliMeter.convert(d, DistanceUnit.Meter));
		System.out.println(d + " Meter in CentiMeter\t: " + DistanceUnit.CentiMeter.convert(d, DistanceUnit.Meter));
		System.out.println(d + " Meter in DeciMeter\t: " + DistanceUnit.DeciMeter.convert(d, DistanceUnit.Meter));

		System.out.println(d + " Meter in DecaMeter\t: " + DistanceUnit.DecaMeter.convert(d, DistanceUnit.Meter));
		System.out.println(d + " Meter in HectaMeter\t: " + DistanceUnit.HectaMeter.convert(d, DistanceUnit.Meter));
		System.out.println(d + " Meter in KiloMeter\t: " + DistanceUnit.KiloMeter.convert(d, DistanceUnit.Meter));
		System.out.println(d + " Meter in Mile\t: " + DistanceUnit.Mile.convert(d, DistanceUnit.Meter));
		System.out.println("\n" + d + " DecaMeter in NanoMeter\t: " + DistanceUnit.NanoMeter.convert(d, DistanceUnit.DecaMeter));
		System.out.println(d + " DecaMeter in MicroMeter\t: " + DistanceUnit.MicroMeter.convert(d, DistanceUnit.DecaMeter));
		System.out.println(d + " DecaMeter in MilliMeter\t: " + DistanceUnit.MilliMeter.convert(d, DistanceUnit.DecaMeter));
		System.out.println(d + " DecaMeter in CentiMeter\t: " + DistanceUnit.CentiMeter.convert(d, DistanceUnit.DecaMeter));
		System.out.println(d + " DecaMeter in DeciMeter\t: " + DistanceUnit.DeciMeter.convert(d, DistanceUnit.DecaMeter));
		System.out.println(d + " DecaMeter in Meter\t: " + DistanceUnit.Meter.convert(d, DistanceUnit.DecaMeter));

		System.out.println(d + " DecaMeter in HectaMeter\t: " + DistanceUnit.HectaMeter.convert(d, DistanceUnit.DecaMeter));
		System.out.println(d + " DecaMeter in KiloMeter\t: " + DistanceUnit.KiloMeter.convert(d, DistanceUnit.DecaMeter));
		System.out.println(d + " DecaMeter in Mile\t: " + DistanceUnit.Mile.convert(d, DistanceUnit.DecaMeter));
		System.out.println("\n" + d + " HectaMeter in NanoMeter\t: " + DistanceUnit.NanoMeter.convert(d, DistanceUnit.HectaMeter));
		System.out.println(d + " HectaMeter in MicroMeter\t: " + DistanceUnit.MicroMeter.convert(d, DistanceUnit.HectaMeter));
		System.out.println(d + " HectaMeter in MilliMeter\t: " + DistanceUnit.MilliMeter.convert(d, DistanceUnit.HectaMeter));
		System.out.println(d + " HectaMeter in CentiMeter\t: " + DistanceUnit.CentiMeter.convert(d, DistanceUnit.HectaMeter));
		System.out.println(d + " HectaMeter in DeciMeter\t: " + DistanceUnit.DeciMeter.convert(d, DistanceUnit.HectaMeter));
		System.out.println(d + " HectaMeter in Meter\t: " + DistanceUnit.Meter.convert(d, DistanceUnit.HectaMeter));
		System.out.println(d + " HectaMeter in DecaMeter\t: " + DistanceUnit.DecaMeter.convert(d, DistanceUnit.HectaMeter));

		System.out.println(d + " HectaMeter in KiloMeter\t: " + DistanceUnit.KiloMeter.convert(d, DistanceUnit.HectaMeter));
		System.out.println(d + " HectaMeter in Mile\t: " + DistanceUnit.Mile.convert(d, DistanceUnit.HectaMeter));
		System.out.println("\n" + d + " KiloMeter in NanoMeter\t: " + DistanceUnit.NanoMeter.convert(d, DistanceUnit.KiloMeter));
		System.out.println(d + " KiloMeter in MicroMeter\t: " + DistanceUnit.MicroMeter.convert(d, DistanceUnit.KiloMeter));
		System.out.println(d + " KiloMeter in MilliMeter\t: " + DistanceUnit.MilliMeter.convert(d, DistanceUnit.KiloMeter));
		System.out.println(d + " KiloMeter in CentiMeter\t: " + DistanceUnit.CentiMeter.convert(d, DistanceUnit.KiloMeter));
		System.out.println(d + " KiloMeter in DeciMeter\t: " + DistanceUnit.DeciMeter.convert(d, DistanceUnit.KiloMeter));
		System.out.println(d + " KiloMeter in Meter\t: " + DistanceUnit.Meter.convert(d, DistanceUnit.KiloMeter));
		System.out.println(d + " KiloMeter in DecaMeter\t: " + DistanceUnit.DecaMeter.convert(d, DistanceUnit.KiloMeter));
		System.out.println(d + " KiloMeter in HectaMeter\t: " + DistanceUnit.HectaMeter.convert(d, DistanceUnit.KiloMeter));

		System.out.println(d + " KiloMeter in Mile\t: " + DistanceUnit.Mile.convert(d, DistanceUnit.KiloMeter));
		System.out.println("\n" + d + " Mile in NanoMeter\t: " + DistanceUnit.NanoMeter.convert(d, DistanceUnit.Mile));
		System.out.println(d + " Mile in MicroMeter\t: " + DistanceUnit.MicroMeter.convert(d, DistanceUnit.Mile));
		System.out.println(d + " Mile in MilliMeter\t: " + DistanceUnit.MilliMeter.convert(d, DistanceUnit.Mile));
		System.out.println(d + " Mile in CentiMeter\t: " + DistanceUnit.CentiMeter.convert(d, DistanceUnit.Mile));
		System.out.println(d + " Mile in DeciMeter\t: " + DistanceUnit.DeciMeter.convert(d, DistanceUnit.Mile));
		System.out.println(d + " Mile in Meter\t: " + DistanceUnit.Meter.convert(d, DistanceUnit.Mile));
		System.out.println(d + " Mile in DecaMeter\t: " + DistanceUnit.DecaMeter.convert(d, DistanceUnit.Mile));
		System.out.println(d + " Mile in HectaMeter\t: " + DistanceUnit.HectaMeter.convert(d, DistanceUnit.Mile));
		System.out.println(d + " Mile in KiloMeter\t: " + DistanceUnit.KiloMeter.convert(d, DistanceUnit.Mile));

	}

	private static void lrnString() {
		StringPool lrnStrPool = new StringPool();
		lrnStrPool.strConcatByFinal();
	}

	private static void lrnBoxedPrimitives() {
		BoxedPrimitive obj = new BoxedPrimitive();
		obj.extractRepoDetails(obj.knowledgeRepoRowOne);
		obj.extractRepoDetails(obj.knowledgeRepoRowTwo);

		obj.analyseCostingFactor();
	}

}
