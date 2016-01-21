package nl.ireal.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MappingData {

    static List<List<String>> nestedList = Arrays.asList(
            Arrays.asList("Word 1", "Word 2"),
            Arrays.asList("Word 3", "Word 4")
    );

    static Integer[] integers;

    static {
        integers = new Integer[10];

        for (int i = 0; i < integers.length; ++i) {
            integers[i] = 10 * i;
        }

        integers[8] = -10;
    }

    public static void main(String[] args) {
        //Goal: print all words without using the 'for' keyword
        //Map function can be used to extract data in substreams
        nestedList.stream().flatMap(List::stream).forEach(System.out::println);

        //Exception handling in streams and nested lambda code
        Arrays.asList(integers)
                .stream().flatMap(i -> {
            try {
                return Stream.of(getValue(i));
            } catch (IllegalArgumentException e) {
                return Stream.empty();
            }
        }).forEach(System.out::println);
    }

    /**
     * Gets a string value from an int
     *
     * @param value the value
     * @return the string value of the int
     * @throws IllegalArgumentException if value is < 0
     */
    public static String getValue(int value) throws IllegalArgumentException {
        if (value < 0)
            throw new IllegalArgumentException("Can not be negative");
        return Integer.toString(value);
    }


}
