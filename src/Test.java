//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author aminoiu
 * @since 6/5/2026
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Anna1", 20);
        Person p2 = new Person("Joh", 25);
        Person p3 = new Person("Igor8888", 50);
        Person p4 = new Person("Alina", 10);

        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        if (p1.compareTo(p2) > 0) System.out.println(p1.getName() + " is older than " + p2.getName());
        if (p1.compareTo(p2) < 0) System.out.println(p2.getName() + " is older than " + p1.getName());
        if (p1.compareTo(p2) == 0) System.out.println(p1.getName() + " and " + p2.getName() + " have the same age");

        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old");
        }

        people.sort((person1, person2) -> {
            if (person1.getName().length() > person2.getName().length()) return 1;
            if (person1.getName().length() < person2.getName().length()) return -1;
            return 0;
        });

        people.sort((pers1, pers2) -> pers1.getAge() - pers2.getAge());
//        people.sort(Comparator.comparing((pers1, pers2) -> ((Person)pers1).getAge() - ((Person)pers2).getAge()).reversed());
        System.out.println("Sorted list");
        for (Person person : people) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old");
        }


        System.out.println("Total salary: " + calculateSalaryWithBonus(new Employee("Anna", 30, 5000),
                employee -> employee.getSalary() * 0.15));

        people = people.stream()
                .filter(person -> person.getAge() > 20)
                .toList();
//                .forEach(person -> System.out.println(person.getName() + " is " + person.getAge() + " years old"));
        System.out.println("===============");

        for (Person person : people) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old");
        }

        people.stream().map(person -> {
            person.setAge(person.getAge() + 1);
            return person;
        }).toList();
        List<Person> pdsds = new ArrayList<>();
//        people.stream().map(Person::getAge)
        people.stream().forEach(person -> pdsds.add(person));
    }

    static double calculateSalaryWithBonus(Employee employee, Function<Employee, Double> bonusFunction) {
        double salary = employee.getSalary();
        double bonus = bonusFunction.apply(employee);
        double totalSalary = salary + bonus;
        return totalSalary;
    }
}