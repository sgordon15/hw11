package edu.ti.caih313.collections.demo;

import java.util.Collection;
import java.util.Iterator;

public class PrintGeneric<T> {

    public void printCollection(Collection<T> collection) {
        Iterator<T> tIterator = collection.iterator();
        while (tIterator.hasNext()) {
            T p = tIterator.next();
            System.out.println(p.toString());
        }
    }
}
