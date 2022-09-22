package com.company.service;

import com.company.Address;

public class AddressService {

    public Address getAddress(int i) {
        String c;
        String s;
        if (i == 1) {
            c = "Madurai";
            s = "TN";
            return new Address(c, s);
        } else if (i == 2) {
            c = "Devadhanapati";
            s = "TN";
            return new Address(c, s);
        }
        return null;
    }
}
