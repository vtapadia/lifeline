package org.jeevanrekha.code.domain;

import java.util.Arrays;
import java.util.List;

public enum BloodGroup {

    AB_positive(),
    AB_negative(),
    A_positive(AB_positive),
    A_negative(AB_negative),
    B_positive(AB_positive),
    B_negative(AB_negative),
    O_positive(A_positive, B_positive, AB_positive),
    O_negative(A_negative, B_negative, AB_negative);

    private final List<BloodGroup> donnars;

    BloodGroup(BloodGroup ... donnar){
        this.donnars = Arrays.asList(donnar);
        this.donnars.add(this);
    }

    public List<BloodGroup> getDonnars() {
        return donnars;
    }


}
