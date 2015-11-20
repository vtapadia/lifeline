package org.jeevanrekha.code.controller;

import org.jeevanrekha.code.domain.BloodGroup;

/**
 * Created by vareshtapadia on 20/11/15.
 */
public class RequestBlood {

    private final BloodGroup bloodGroup;

    private final Location location;

    public RequestBlood(BloodGroup bloodGroup, Location location) {
        this.bloodGroup = bloodGroup;
        this.location = location;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public Location getLocation() {
        return location;
    }
}
