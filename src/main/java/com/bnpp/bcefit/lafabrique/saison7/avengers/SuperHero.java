package com.bnpp.bcefit.lafabrique.saison7.avengers;

import java.util.Collections;
import java.util.List;

public class SuperHero extends Humanoid {
    private final List<String> powers;
    private final String heroname;

    public SuperHero(Humanoid humanoid, String heroname, List<String> powers) {
        super(humanoid.getName(), humanoid.getAge());
        this.powers = powers;
        this.heroname = heroname;
    }

    public List<String> getPowers() {
        return Collections.unmodifiableList(powers);
    }
}


