package com.company.service;

import com.company.Address;
import com.company.Experience;

public class JobService {

    public Experience getExperience(int i) {
        int exp;
        String technology;
        if (i == 1) {
            exp = 1;
            technology = "Java";
            return new Experience(exp, technology);
        } else if (i == 2) {
            exp = 2;
            technology = "Groovy";
            return new Experience(exp, technology);
        }
        return null;
    }
}
