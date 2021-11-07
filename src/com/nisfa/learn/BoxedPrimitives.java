package com.nisfa.learn;

/**
 * Expose the utilization of Boxed Primitive in document processing
 */
public class BoxedPrimitives {

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
    final static String knowledgeRepoHeader = new StringBuilder("Title\t")
            .append("Author Name\t")
            .append("Publication\t")
            .append("Year\t")
            .append("Rating\n").toString();

    final static String knowledgeRepoRowOne = new StringBuilder("Introduction to AI\t")
            .append("Nitheesh\t")
            .append("Packt\t")
            .append("2016\t")
            .append("4.8\n").toString();

    final static String knowledgeRepoRowTwo = new StringBuilder("Java in Deep Learning\t")
            .append("Dheeru Mundaluru\t")
            .append("Udemy\t")
            .append("2015\t")
            .append("4.8\n").toString();

//    final String[] header, rowOne, rowTwo;

    {
//        extractRepoDetails(knowledgeRepo);
        extractRepoDetails(knowledgeRepoRowOne);
        extractRepoDetails(knowledgeRepoRowTwo);
    }

    /**
     * used to extract the primitive data while processing the doc which is carried as arg value
     *
     * @param rowValue
     */
    private void extractRepoDetails(String rowValue) {
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
        System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\t\t\t");
    }
    // use case of Boxed Primitives / wrapper

    // to extract primitive data type in word processing
//    Integer boxedInt = Integer.parseInt("");

}
