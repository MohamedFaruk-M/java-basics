package com.nisfa.learn.oop;

/**
 * class used to distinguish the types
 * along with real time use case
 */
public class AccessModifier {

    /**
     * variables and methods accessible only
     * with in a class where it is defined
     */
    static private String privateMember = "privateMember";

    /**
     * accessibility only with in a package
     * (or) across family members
     */
    static String defaultMember = "defaultMember";

    /**
     * having similar visibility as default
     * but along with powerful supportive feature
     * in the context of inheritance
     * <ul>
     *     Inherited protected field
     *     <li>
     *         can be accessed from non-family members
     *         (or) out side a package
     *         where the derived class is defined
     *         <ol type="i">
     *             <li style="color: #00cc00">
     *                 C2 extends A1 {
     *                 sysout(protectedMember)
     *                 }
     *             </li>
     *         </ol>
     *     </li>
     *     <li>
     *          but cannot be accessible in non-family members
     *          other than the derived class
     *         <ol type="i">
     *             <li style="color: #ff0000">
     *                 B2 {
     *                 sysout(C2.protectedMember)
     *                 }
     *             </li>
     *         </ol>
     *     </li>
     *     <li>
     *         Also visibility extends to access inherited
     *         non-family members even in any of the family members
     *         <ol type="i">
     *             <li style="color: #00cc00">
     *                 B1 {
     *                 sysout(C2.protectedMember)
     *                 }
     *             </li>
     *         </ol>
     *     </li>
     * </ul>
     */
    static protected String protectedMember = "protectedMember";

    /**
     * fields and methods having global visibility
     */
    static public String publicMember = "publicMember";
}
