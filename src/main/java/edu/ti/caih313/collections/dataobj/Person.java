package edu.ti.caih313.collections.dataobj;

public class Person {
    private Name name;
    private Sex gender;
    private double age;
    private String emailAddress;

    public enum Sex{MALE, FEMALE}

    public Person(Name name, Sex gender) {
        this.name = name;
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Sex getGender() {
        return gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", gender=" + gender +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
