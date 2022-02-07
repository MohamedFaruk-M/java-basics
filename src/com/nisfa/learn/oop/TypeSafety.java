package com.nisfa.learn.oop;

/**
 * template to highlight the advantage of Java
 * over some other programming languages
 * in the context of Type-Safe language
 */
public class TypeSafety {

    /**
     * <p style="border-left:5px;color:red;padding:2px 2px">
     * private int i = 3.3f
     * </p>
     *
     * @return
     */
    // compile time checking (or) static-type checking
    public static String testStaticType() {
        return "explore some static type checking";
    }

    // Strong and Weak type programming languages

    /**
     *      <ol style="border-left:5px solid red;background-color:#f1f1f1;padding:5px 5px;list-style-type:none">
     *          <li>ClassCastException</li>
     *          <li>
     *              Memory-Safety Exception
     *              <ol><li>ArrayOutOfBoundException</li></ol>
     *
     *          </li>
     *      </ol>
     *
     * @return
     */
    // run time checking (or) dynamic-type checking
    public static String testDynamicType() {
        return "explore run time validation";
    }

//    static {
//        testStaticType();
//        testDynamicType();
//    }
}
