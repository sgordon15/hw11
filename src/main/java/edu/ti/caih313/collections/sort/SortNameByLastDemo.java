package edu.ti.caih313.collections.sort;

import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.NameByLast;
import edu.ti.caih313.collections.demo.PrintGeneric;

import java.util.*;

public class SortNameByLastDemo {
    public static void main(String... args) {
        NameByLast nameArray[] = {
                new NameByLast("John", "Smith"),
                new NameByLast("Karl", "Ng"),
                new NameByLast("Jeff", "Smith"),
                new NameByLast("Tom", "Rich"),
                new NameByLast("Bob", "Smith"),
                new NameByLast("Jane", "Doe"),
                new NameByLast("Tony", "Stark"),
                new NameByLast("Bo", "Peep")
        };

        List<NameByLast> nameList = Arrays.asList(nameArray);

        PrintGeneric<NameByLast> nameSortDemo = new PrintGeneric<>();
        nameSortDemo.printCollection(nameList);
        Collections.sort(nameList);
        System.out.print("\n");
        System.out.println("Print sorted nameList.");
        nameSortDemo.printCollection(nameList);
    }
}
