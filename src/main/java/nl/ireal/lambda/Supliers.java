package nl.ireal.lambda;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Supliers {

    public static void main(String[] args) {
        Integer number = 123;
        Supplier<String> nullSupplier = number::toString;
        System.out.println(nullSupplier.get());


        Consumer<String> consumer = Supliers::printString;
        consumer.accept("Hi");

        String[] strings = {"One", "Two", "Three"};

        Arrays.asList(strings).forEach(consumer);
        Arrays.asList(strings).forEach(Supliers::printString);
        Arrays.asList(strings).forEach(System.out::println);
    }

    static void printString(String string) {
        System.out.println(string);
    }
}
