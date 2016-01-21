package nl.ireal.lambda;

import java.util.Arrays;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        theOldWay().run();
        theNewWay().run();

        functionalConstructor();
        constructorTraditional();
    }

    static Runnable theOldWay() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("The old fashioned way.");
            }
        };
    }

    static Runnable theNewWay() {
        return () -> System.out.println("The new way.");
    }

    static void functionalConstructor() {
        String[] names = {"Peter", "Rutger", "Sven"};
        Arrays.asList(names).stream().map(MyObject::new).forEach(System.out::println);
    }

    static void constructorTraditional() {
        String[] names = {"Peter", "Rutger", "Sven"};
        MyObject[] objects = new MyObject[names.length];

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            objects[i] = new MyObject(name);
            System.out.println(objects[i]);
        }
    }

    //Constructors are functional too...
    static class MyObject{
        private final String value;

        MyObject(String param) {
            this.value = param;
        }

        @Override
        public String toString() {
            return "MyObject{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }
}
