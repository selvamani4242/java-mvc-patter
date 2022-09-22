package com.company.controller;

import com.company.Person;
import com.company.service.PersonCompositeService;

public class Controller {


    public static void main(String[] args) {
        int input = 2;
        PersonCompositeService personCompositeService = new PersonCompositeService();
        Person person = personCompositeService.getPerson(input);
        System.out.println(person.getAddress().getCity());
    }
}
