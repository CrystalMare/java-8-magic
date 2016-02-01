package nl.ireal.lambda;

import java.util.Optional;

public class CodingWithoutNullchecks {

    /*
    The main reason you would use is is to indicate that a given method CAN return null so it can be used in streams.
    Java <7 has no way of showing that an object can be null.
    Surely, you can add your own way of doing this. But this is a universal way of doing it with lambda
    With the introduction of lamda and functional interfaces, this can be made easy.
    More on this topic:
    http://www.deadcoderising.com/2015-10-06-java-8-removing-null-checks-with-optional/
     */
    public static void main(String[] args) {
        //The old way:
        Object oldObject = getObjectByIdOld(10);
        if (oldObject != null)
            System.out.println(oldObject);

        //The new way of doing it
        Optional<Object> object = getObjectById(10);
        System.out.println(object);
        object.ifPresent(System.out::println);

        Optional<Object> object2 = getObjectById(1000);
        System.out.println(object2);
        object2.ifPresent(System.out::println);
    }

    static Optional<Object> getObjectById(int id) {
        if (id == 10)
            return Optional.of(new Object() {
                @Override
                public String toString() {
                    return "I am an object!";
                }
            });

        return Optional.empty();
    }

    static Object getObjectByIdOld(int id) {
        if (id == 10)
                return new Object() {
                    @Override
                    public String toString() {
                        return "I am also an object!";
                    }
                };
        return null;
    }
}
