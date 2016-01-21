package nl.ireal.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    static List<Person> audience = Arrays.asList(
            new Person("Peter"), new Person("Rutger"), new Person("Sven")
    );

    public static void main(String[] args) {
        System.out.println("Printing the old fashioned way:");
        for (String name : getNamesOldWay()) {
            System.out.println(name);
        }

        System.out.println("Printing the new way:");
        getNamesWithFunctionPointer().forEach(System.out::println);
    }


    static List<String> getNamesOldWay() {
        List<String> names = new ArrayList<>(audience.size());
        for (Person person : audience) {
            names.add(person.getName());
        }
        return names;
    }

    static List<String> getNamesNewWay() {
        return audience.stream().map(person -> {
            return person.getName();
        }).collect(Collectors.toList());
    }

    static List<String> getNamesNewWayWithoutReturn() {
        return audience.stream().map(person -> person.getName()).collect(Collectors.toList());
    }

    static List<String> getNamesWithFunctionPointer() {
        return audience.stream().map(Person::getName).collect(Collectors.toList());
    }


    /**
     * A person with a name
     */
    static class Person {
        private final String name;

        Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
