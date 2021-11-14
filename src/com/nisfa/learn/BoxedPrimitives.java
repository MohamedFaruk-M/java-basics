package com.nisfa.learn;

/**
 * Expose the utilization of Boxed Primitive in document processing
 */
public class BoxedPrimitives {

    final static long NANO_MILLI_FACTOR = 1000000L;

//    final static String knowledgeRepo = new StringBuilder("Title\t")
//            .append("Author Name\t")
//            .append("Publication\t")
//            .append("Year\t")
//            .append("Rating\n")
//            .append("Introduction to AI\t")
//            .append("Nitheesh\t")
//            .append("Packt\t")
//            .append("2016\t")
//            .append("4.8\n")
//            .append("Java in Deep Learning\t")
//            .append("Dheeru Mundaluru\t")
//            .append("Udemy\t")
//            .append("2015\t")
//            .append("4.8\n").toString();

    // TODO implement the file reader strategy
    public final static String knowledgeRepoHeader = new StringBuilder("Title\t")
            .append("Author Name\t")
            .append("Publication\t")
            .append("Year\t")
            .append("Rating\n").toString();

    public final static String knowledgeRepoRowOne = new StringBuilder("Introduction to AI\t")
            .append("Nitheesh\t")
            .append("Packt\t")
            .append("2016\t")
            .append("4.8\n").toString();

    public final static String knowledgeRepoRowTwo = new StringBuilder("Java in Deep Learning\t")
            .append("Dheeru Mundaluru\t")
            .append("Udemy\t")
            .append("2015\t")
            .append("4.8\n").toString();

//    final String[] header, rowOne, rowTwo;

//    {
//        extractRepoDetails(knowledgeRepo);
//        extractRepoDetails(knowledgeRepoRowOne);
//        extractRepoDetails(knowledgeRepoRowTwo);
//    }

    /**
     * used to extract the primitive data while processing the doc which is carried as arg value
     *
     * @param rowValue
     */
    public void extractRepoDetails(String rowValue) {
        System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\t\t\t");
        System.out.print("Parsing " + rowValue);
        if (rowValue == null) {
            return;
        }

        final String[] columns = rowValue.split("\t");

        String title = columns[0], authorName = columns[1], publication = columns[2];
        Integer year = Integer.parseInt(columns[3]);
        Double rating = Double.parseDouble(columns[4]);

        System.out.println("The book " + title + " was presented by " + authorName
                + " through the mediator of " + publication + " in " + year + " has gained the score value of "
                + rating + " in the audience");
    }
    // use case of Boxed Primitives / wrapper

    // to extract primitive data type in word processing
//    Integer boxedInt = Integer.parseInt("");

    // Static factory method: recommended to use b/w the range -128 to +127
//    Integer staticFactoryInt = Integer.valueOf(1);

    // auto boxing/unBoxing not applicable for nD array
//    Integer[] prime = new int[] {1, 2, 3, 5, 7, 11};


    /**
     * used to compute the cost-effectiveness of boxed primitive over the primitive
     */
    // prefer primitive over Boxed primitive
    public void analyseCostingFactor() {
        System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\t\t\t");
        System.out.println("Time to learn about the expense of auto boxing/unBoxing");
        long boxedPrimitiveCostFactor = computeExpensiveness(true) / computeExpensiveness(false);
        System.out.println("\tComparatively cost factor of boxed primitive over primitive is: " + boxedPrimitiveCostFactor);
    }

    /**
     * @param withAutoBoxingUnBoxing
     * @return
     */
    private long computeExpensiveness(boolean withAutoBoxingUnBoxing) {
        long start = System.nanoTime();
        long timeTaken = 0L;
        if (withAutoBoxingUnBoxing) {
            Long sum = 0L;
            for (int i = 1; i < Integer.MAX_VALUE; ++i)
                sum += i;
        } else {
            long sum = 0L;
            for (int i = 1; i < Integer.MAX_VALUE; ++i)
                sum += i;
        }
        timeTaken = (System.nanoTime() - start) / NANO_MILLI_FACTOR;
        System.out.println("\tTime taken to compute the sum of all the positive integers "
                + (withAutoBoxingUnBoxing ? "with" : "without")
                + " auto boxing/unBoxing is: " + timeTaken + "ms");
        return timeTaken;
    }

    // equality and non-equality check

    // same type comparison operation

    // mixed type comparison

}
