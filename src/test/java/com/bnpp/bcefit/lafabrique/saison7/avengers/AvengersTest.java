package com.bnpp.bcefit.lafabrique.saison7.avengers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.bnpp.bcefit.lafabrique.saison7.avengers.ListOfHero.avengers;
import static org.assertj.core.api.Assertions.assertThat;

public class AvengersTest {

    private static final int AGE_MINEUR = 17;
    private static final String HERO = "Thanos the Titan";

    @Test
    public void test_should_spiderman_est_mineur() {
        SuperHero spidrman = ListOfHero.spiderman;
        int spiderman = spidrman.getAge();
        Assertions.assertThat(spidrman.getAge()).isLessThanOrEqualTo(AGE_MINEUR);

    }

    @Test
    public void test_should_blackwidow_is_avengers() {
        //assertThat(ListOfHero.blackWidow).isIn(avengers);
        assertThat(avengers).contains(ListOfHero.blackWidow);

    }

    @Test
    public void test_should_not_have_duplicate_in_avengers() {
        assertThat(avengers).doesNotHaveDuplicates();
    }

    @Test
    public void test_should_thanos_not_in_avengers() {

        assertThat(avengers).doesNotContain(ListOfHero.thanos);

    }

    @Test
    public void test_should_thor_thanos_has_not_name() {
        assertThat(ListOfHero.thor.getName()).isNull();
        assertThat(ListOfHero.thanos.getName()).isNull();

    }

    @Test
    public void test_should_thanos_have_same_power_hulk() {
        assertThat(ListOfHero.thanos.getPowers()).containsAll(ListOfHero.hulk.getPowers());

    }

}
