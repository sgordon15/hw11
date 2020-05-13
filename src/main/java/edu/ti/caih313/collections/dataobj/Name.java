package edu.ti.caih313.collections.dataobj;

import java.util.Objects;

public class Name {
    protected final String firstName;
    protected final String lastName;

    public Name(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Both first and last name must be specified.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
