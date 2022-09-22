package com.company.service;

import com.company.Address;
import com.company.Experience;
import com.company.Person;

public class PersonCompositeService {

    public Person getPerson(int i) {
        AddressService addressService = new AddressService();
        JobService jobService = new JobService();
        Address address = addressService.getAddress(i);
        Experience experience = jobService.getExperience(i);
        Person person = new Person(address, experience);
        return person;
    }
}
