package com.nisfa.learn.basic;

public class Variable {

	/**
	 * explore the ceiling limit validation. compute the value based on the bucket
	 * size when it exceeds the ceiling (-128 to 127)
	 */
    public static void typeCastingByteOverRange() {

        System.out.println("\n -- explore edge cases when type casting over the window range --");

        byte narrowedByte = (byte) 128;
        System.out.println("narrowedByte of 128 is: " + narrowedByte + "\n\n");    //-128

    }

}