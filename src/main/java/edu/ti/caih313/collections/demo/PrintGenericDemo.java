package edu.ti.caih313.collections.demo;

import edu.ti.caih313.collections.dataobj.Name;

import java.util.*;

public class PrintGenericDemo<T> {
    public static void main(String[] args) {
        PrintGeneric<String> stringSortDemo = new PrintGeneric<>();

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

        Name nameArray[] = {
                new Name("John", "Smith"),
                new Name("Karl", "Ng"),
                new Name("Jeff", "Smith"),
                new Name("Tom", "Rich"),
                new Name("Bob", "Smith"),
                new Name("Jane", "Doe"),
                new Name("Tony", "Stark"),
                new Name("Bo", "Peep")
        };

        List<Name> nameList = Arrays.asList(nameArray);

        PrintGeneric<Name> printName = new PrintGeneric<>();
        System.out.print("\n");
        System.out.println("Print nameList.");
        printName.printCollection(nameList);
    }
}
