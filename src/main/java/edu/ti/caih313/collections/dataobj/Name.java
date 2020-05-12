package edu.ti.caih313.collections.dataobj;

public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Both first and last name must be specified.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
