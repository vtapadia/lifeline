package org.jeevanrekha.code.domain;

import org.hibernate.validator.constraints.Email;

/**
 * Created by vareshtapadia on 20/11/15.
 */
public class User {

    private final BloodGroup bloodGroup;

    private final String name;

    private Email email;

    private Phone phone;

    public User(BloodGroup bloodGroup, String name) {
        this.bloodGroup = bloodGroup;
        this.name = name;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public Phone getPhone() {
        return phone;
    }

}
