package com.nisfa.learn;

public class StringPool {

	// scope of String Pool / Interning

	// String concatenation

	// Role of final keyword on string concatenation
    private void strConcatByFinal() {
        final String greet = "Stay Healthy, Always be Happy";

//        System.out.println(greet.intern());
        System.out.println(greet);
    }

    // String Builder as a drop in replacement of String Buffer

    // demo begins with in main
    public static void main (String[] args) {
        StringPool stringPool = new StringPool();
        stringPool.strConcatByFinal();
    }

}
