package edu.ti.caih313.collections.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<Integer>();

        boolean didItAdd = intSet.add(2); //intSet.add(new Integer(2));
        didItAdd = intSet.add(7);
        didItAdd = intSet.add(7);    // Ignored since 7 is already in the set
        didItAdd = intSet.add(3);
        printSet(intSet);

        intSet.remove(3);
        printSet(intSet);

        System.out.println("Set contains 2: " +
                intSet.contains(2));
        System.out.println("Set contains 3: " +
                intSet.contains(3));
    }

    public static void printSet(Set<Integer> intSet) {
        System.out.println("The set contains:");
        for (Integer num : intSet) {
            System.out.println(num.intValue());
        }
    }
}