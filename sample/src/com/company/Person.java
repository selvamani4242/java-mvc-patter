package com.company;

public class Person {
    Address address;
    Experience experience;


    public Person(Address address, Experience experience) {
        this.address = address;
        this.experience = experience;
    }

    public Address getAddress() {
        return address;
    }

    public Experience getExperience() {
        return experience;
    }
}
