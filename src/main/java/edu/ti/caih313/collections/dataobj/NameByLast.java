package edu.ti.caih313.collections.dataobj;

public class NameByLast extends Name implements Comparable<NameByLast> {
    public NameByLast(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int compareTo(NameByLast otherNameByLast) {
        int compare = getLastName().compareTo(otherNameByLast.getLastName());
        if (compare == 0) {
            compare = getFirstName().compareTo(otherNameByLast.getFirstName());
        }
        return compare;
    }
}
