//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

import java.util.Optional;

/**
 *
 * @author aminoiu
 * @since 6/17/2026
 */
public class OptionalExample {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Optional<Person> person = personService.getById(2);

//        person.ifPresent(p -> System.out.println("Found person: " + p.getName() + ", age: " + p.getAge()));

        Person p1 = person.orElse(new Person("Unknown", 0));

        System.out.println("Person name: " + p1.getName() + ", age: " + p1.getAge());

        Person p2 = person.get();
        System.out.println("Person name: " + p2.getName() + ", age: " + p2.getAge());

        String name = person.map(p -> p.getName())
                .orElse("Unknown");

        System.out.println("Person name: " + name);
    }
}