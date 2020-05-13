package edu.ti.caih313.collections.demo;

import edu.ti.caih313.collections.dataobj.Name;

import java.util.*;

public class PrintGenericDemo<T> {
    public static void main(String[] args) {
        PrintGenericDemo<String> stringSortDemo = new PrintGenericDemo<>();
        List<String> wordList = new ArrayList<>();
        wordList.add("Bob");
        wordList.add("Smith");
        wordList.add("Jane");
        wordList.add("Doe");
        wordList.add("bob");
        wordList.add("smith");
        wordList.add("jane");
        wordList.add("doe");

        System.out.println("Print wordList.");
        stringSortDemo.printCollection(wordList);

        Collections.sort(wordList);

        System.out.print("\n");
        System.out.println("Print sorted wordList.");
        stringSortDemo.printCollection(wordList);

        Name bob = new Name("Bob", "Smith");
        Name jane = new Name("Jane", "Doe");
        Name ironMan = new Name("Tony", "Stark");
        Name boPeep = new Name("Bo", "Peep");

        List<Name> nameList = new ArrayList<>();
        nameList.add(bob);
        nameList.add(bob);
        nameList.add(jane);
        nameList.add(bob);
        nameList.add(jane);
        nameList.add(bob);
        nameList.add(boPeep);

        PrintGenericDemo<Name> nameSortDemo = new PrintGenericDemo<>();
        System.out.print("\n");
        System.out.println("Print nameList.");
        nameSortDemo.printCollection(nameList);
    }

    private void printCollection(Collection<T> collection) {
        Iterator<T> personIterator = collection.iterator();
        while (personIterator.hasNext()) {
            T p = personIterator.next();
            System.out.println(p.toString());
        }
    }
}
