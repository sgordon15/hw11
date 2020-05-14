package edu.ti.caih313.collections.sort;

import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.demo.PrintGeneric;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNameDemo {
    public static void main(String... args) {
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
        PrintGeneric<Name> nameSortDemo = new PrintGeneric<>();
        nameSortDemo.printCollection(nameList);

        Comparator<Name> nameByLastListComparator = new Comparator<Name>() {
            @Override
            public int compare(Name n1, Name n2) {
                int nameOrder = n1.getLastName().compareTo(n2.getLastName());
                if (nameOrder == 0) {
                    nameOrder = n1.getFirstName().compareTo(n2.getFirstName());
                }
                return nameOrder;
            }
        };

        Collections.sort(nameList, nameByLastListComparator);
        System.out.print("\n");
        System.out.println("Print sorted by last name nameList.");
        nameSortDemo.printCollection(nameList);

         Comparator<Name> nameByFirstListComparator = new Comparator<Name>() {
            @Override
            public int compare(Name n1, Name n2) {
                int nameOrder = n1.getFirstName().compareTo(n2.getFirstName());
                if (nameOrder == 0) {
                    nameOrder = n1.getLastName().compareTo(n2.getLastName());
                }
                return nameOrder;
            }
        };
        Collections.sort(nameList, nameByFirstListComparator);
        System.out.print("\n");
        System.out.println("Print sorted by first name nameList.");
        nameSortDemo.printCollection(nameList);

    }
}
