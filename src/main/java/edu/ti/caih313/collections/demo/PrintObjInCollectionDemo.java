package edu.ti.caih313.collections.demo;

import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;

import java.util.*;

import static edu.ti.caih313.collections.dataobj.Person.Sex.*;

public class PrintObjInCollectionDemo {

    public static void main(String[] args) {
        Person bob = new Person(new Name("Bob", "Smith"), MALE);
        Person jane = new Person(new Name("Jane", "Doe"), FEMALE);
        Person ironMan = new Person(new Name("Tony", "Stark"), MALE);
        Person boPeep = new Person(new Name("Bo", "Peep"), FEMALE);

        List<Person> personList = new ArrayList<>();
        personList.add(bob);
        personList.add(bob);
        personList.add(jane);
        personList.add(bob);
        personList.add(jane);
        personList.add(bob);
        personList.add(boPeep);

        System.out.println("Print personList with Iterator");
        printObjectIterator(personList);

        Set<Person> personSet = new HashSet<>();
        personSet.addAll(personList);
        System.out.print("\n");
        System.out.println("Print personSet after addAll with Iterator");
        printObjectIterator(personSet);

        personSet.add(jane);
        personSet.add(ironMan);
        personSet.add(boPeep);
        System.out.print("\n");
        System.out.println("Print personSet after adding more with Iterator");
        printObjectIterator(personSet);

        Queue<Person> personQueue = new LinkedList<>();
        personQueue.addAll(personSet);
        System.out.print("\n");
        System.out.println("Print personQueue after addAll personSet with Iterator");
        printObjectIterator(personQueue);

        personQueue.addAll(personList);
        System.out.print("\n");
        System.out.println("Print personQueue after addAll personSet *and* personList with Iterator");
        printObjectIterator(personQueue);


        System.out.print("\n");
        Deque<Person> personDeque = new LinkedList<>();
        personDeque.addAll(personQueue);
        printObjectIterator(personDeque);

        System.out.print("\n");
        System.out.println("Using for-each");
        printObjectsForEach(personSet);
        printObjectsForEach(personList);
        printObjectsForEach(personQueue);
        printObjectsForEach(personDeque);
    }

    static private void printObjectsForEach(Collection<Person> collection) {
        System.out.println("Printing collection of " + collection.getClass().getName());
        for (Person p : collection) {
            System.out.println(p.toString());
        }
    }

    static private void printObjectIterator(Collection<Person> collection) {
        System.out.println("Printing collection of " + collection.getClass().getName());
        Iterator<Person> personIterator = collection.iterator();
        while (personIterator.hasNext()) {
            Person p = personIterator.next();
            System.out.println(p.toString());
        }
    }
}
