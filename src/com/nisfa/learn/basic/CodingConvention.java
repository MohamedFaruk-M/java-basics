package com.nisfa.learn.basic;

public class CodingConvention {

    // Naming conventions: package
    /**
     * should be all in lower-case with len(each word) < 8
     * starts with domain name if the package is exposed as public lib
     * never use java, javax kinda of existing JDK package strategy
     */

    // Naming & styling conventions: class
    /**
     * <p>
     * Naming:
     * <p>
     *     class name starts with capital followed by came-case with minimal usage of numeric
     *     always in singular and self-descriptive
     * </p>
     * Styling:
     * <p>
     *     try to build it as a single responsibility principle class for achieving abstraction
     *     maximum appreciable lines of code should be < 2k
     * </p>
     * Structure:
     * <p>
     *     field declaration
     *     static block
     *     static method
     *     initializer
     *     constructor
     *     instance method
     * </p>
     * </p>
     */

    // Naming conventions: field
    /**
     * try to not use abbreviations (min/max) other than unavoidable situation
     * but acronyms are acceptable (httpUrl)
     * constant field should be always in upper-case with underscore separated
     * final field of object reference will follow another strategy which is yet to be explored
     */

    // Naming & styling conventions: method
    /**
     * try to define a self-descriptive method name
     */


}
