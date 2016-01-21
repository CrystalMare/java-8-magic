package nl.ireal.lambda;

public class DefaultMethods {

    public static void main(String[] args) {
        Person person = new Person("Sven", "Olderaan");
        System.out.println(person.getFullname());
    }

    interface Nameable {
        String getFirstname();

        String getLastname();

        default String getFullname() {
            return getFirstname() + " " + getLastname();
        }
    }

    static class Person implements Nameable {

        private final String firstname, lastname;

        public Person(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        @Override
        public String getFirstname() {
            return firstname;
        }

        @Override
        public String getLastname() {
            return lastname;
        }
    }
}
