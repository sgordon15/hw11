package edu.ti.caih313.collections.dataobj;

public class Person {
    private Name name;
    private Gender gender;

    //private EmailAddress emailAddress;

    //age in years
    //TODO -- replace by Date birthday, and getAge that calculates age
    private Integer age;

    public enum Gender {MALE, FEMALE}

    public Person(Name name, Gender gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", gender=" + gender +
                ", age=" + age
                + "}";
    }
}
