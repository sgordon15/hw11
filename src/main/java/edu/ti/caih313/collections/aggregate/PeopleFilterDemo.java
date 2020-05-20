package edu.ti.caih313.collections.aggregate;

import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import static edu.ti.caih313.collections.dataobj.Person.Gender.*;

public class PeopleFilterDemo {
    public static void main(String... args) {
        Person personArray[] = {
                new Person(new Name("John", "Smith"), MALE, 42),
                new Person(new Name("Karl", "Ng"), MALE, 73),
                new Person(new Name("Jeff", "Smith"), MALE, 21),
                new Person(new Name("Tom", "Rich"), MALE, 18),
                new Person(new Name("Bob", "Smith"), MALE, 13),
                new Person(new Name("Jane", "Doe"), FEMALE, 27),
                new Person(new Name("Tony", "Stark"), MALE, 52),
                new Person(new Name("Bo", "Peep"), FEMALE, 205)
        };

        System.out.println("All persons");
        Arrays.stream(personArray).forEach(e -> System.out.println(e.getName()));

        System.out.print("\n");
        long numOver20 = Arrays.stream(personArray).filter(p -> p.getAge() > 20).count();
        System.out.println("Number of persons older than 20: " + numOver20);

        System.out.print("\n");
        System.out.println("All persons older than 20");
        Arrays.stream(personArray)
                .filter(p -> p.getAge()>20)
                .forEach(e -> System.out.println(e.getName()));

        System.out.print("\n");
        System.out.println("All " + MALE + " persons");
        Arrays.stream(personArray)
                .filter(p -> p.getGender()==MALE)
                .forEach(p -> System.out.println(p.getName()));

        System.out.print("\n");
        OptionalDouble averageFemaleAge =
                Arrays.stream(personArray)
                .filter(p -> p.getGender()==FEMALE)
                .mapToInt(Person::getAge) // <=> mapToInt(p -> p.getAge())
                .average();
        if (averageFemaleAge.isPresent()) {
            System.out.println("Average age of  "
                    + FEMALE + " persons = "
                    + averageFemaleAge.getAsDouble());
        } else {
            System.out.println("Average age of  "
                    + FEMALE + " persons is not available.");
        }

        System.out.print("\n");
        System.out.println("All persons in age order");
        Arrays.stream(personArray)
                .sorted((p1,p2) -> (p1.getAge() - p2.getAge()))
                .forEach(e -> System.out.println(e.getName()));

        System.out.print("\n");
        System.out.println("First four last names uppercased.");
        Stream<String> fourLastNamesUpperStream =
                Arrays.stream(personArray)
                .map(p -> p.getName().getLastName().toUpperCase())
                .sorted()
                .limit(4);
        fourLastNamesUpperStream.forEach(s -> System.out.print(s + ", "));
    }
}
