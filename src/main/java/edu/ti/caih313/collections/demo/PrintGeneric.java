package edu.ti.caih313.collections.demo;

import java.util.Collection;
import java.util.Iterator;

public class PrintGeneric<T> {

    public void printCollection(Collection<T> collection) {
        Iterator<T> personIterator = collection.iterator();
        while (personIterator.hasNext()) {
            T p = personIterator.next();
            System.out.println(p.toString());
        }
    }
}
