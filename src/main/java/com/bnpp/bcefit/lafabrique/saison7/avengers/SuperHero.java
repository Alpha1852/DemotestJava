package com.bnpp.bcefit.lafabrique.saison7.avengers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperHero extends Humanoid {
    private final List<String> powers;

    public SuperHero(Humanoid humanoid, ArrayList<String> powers) {
        super(humanoid.getName(), humanoid.getAge());
        this.powers = powers;
    }

    public List<String> getPowers() {
        return Collections.unmodifiableList(powers);
    }
}


