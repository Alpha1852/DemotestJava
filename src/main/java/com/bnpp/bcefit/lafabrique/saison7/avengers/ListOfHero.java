package com.bnpp.bcefit.lafabrique.saison7.avengers;

import java.util.Arrays;
import java.util.List;

public class ListOfHero {

    public static final Humanoid peterParker = new Humanoid("Peter Parker", 15);
    public static final Humanoid tonyStark = new Humanoid("Tony Stark", 48);
    public static final Humanoid bruceBanner = new Humanoid("Bruce Banner", 48);
    public static final Humanoid thorOfAsgard = new Humanoid("Thor of Asgard", 1500);
    public static final Humanoid natashaRomanoff = new Humanoid("Natasha Romanoff", 33);
    public static final Humanoid steveRogers = new Humanoid("Steve Rogers", 106);
    public static final Humanoid clintonBarton = new Humanoid("Clinton Barton", 35);
    public static final Humanoid thanosTheTitan = new Humanoid("Thanos the Titan", 750000);
    public static final SuperHero spiderman = new SuperHero(peterParker, "Spider-man", Arrays.asList("Web Shooting", "Agility"));
    public static final SuperHero ironman = new SuperHero(tonyStark, "Iron Man", Arrays.asList("High-tech armor", "Rich"));
    public static final SuperHero hulk = new SuperHero(bruceBanner, "Hulk", List.of("Strong"));
    public static final SuperHero thor = new SuperHero(thorOfAsgard, null, Arrays.asList("Mjöllnir", "Immortal"));
    public static final SuperHero blackWidow = new SuperHero(natashaRomanoff, "Black Widow", List.of("Close Combat"));
    public static final SuperHero captainAmerica = new SuperHero(steveRogers, "Captain America", Arrays.asList("Vibranium Shield",
            "Super-soldier"));
    public static final SuperHero hawkEye = new SuperHero(clintonBarton, "Hawk Eye", List.of("Bow and arrows"));
    public static final List<SuperHero> avengers = Arrays.asList(ironman, hulk, thor, blackWidow, captainAmerica, hawkEye, spiderman);
    public static final SuperHero thanos = new SuperHero(thanosTheTitan, null, Arrays.asList("Strong", "Infinity Gauntlet"));


}
