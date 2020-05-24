package edu.ti.caih313.collections.dataobj;

import java.util.HashMap;

public class Person {
    public enum Gender{MALE,FEMALE}
    private Integer age;
    private Name name;
    private Gender gender;
    private EmailAddress emailAddressMap;


    public Person(Name name, Gender gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        emailAddressMap = new EmailAddress();
        emailAddressMap.personsEmailAddress = new HashMap<EmailAddress.EmailType, String>();
    }
    public Name getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public void addEmail (EmailAddress.EmailType emailType, String emailAddress)
    {
        emailAddressMap.personsEmailAddress.put(emailType, emailAddress);
    }
    public HashMap<EmailAddress.EmailType, String> getEmailMap () {
        return emailAddressMap.personsEmailAddress;
    }
    @Override
    public String toString () {
        return "Person{" + "name=" + name +
                ", gender=" + gender +
                ", age=" + age
                + "}";
    }
}

