package be.cegeka.gameoflife.rules;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OverpopulationRuleTest {

    @Test
    public void whenGetNextStateForCell_thenAlwaysReturnFalse() {
        OverpopulationRule overpopulationRule = new OverpopulationRule();

        boolean result = overpopulationRule.getNextStateForCell();

        assertThat(result).isFalse();
    }

    @Test
    public void givenIsALiveAndFourLivingNeighbors_whenApplicable_thenReturnTrue() {
        OverpopulationRule overpopulationRule = new OverpopulationRule();

        boolean applicable = overpopulationRule.isApplicable(true, 4);

        assertThat(applicable).isTrue();
    }

    @Test
    public void givenIsALiveAndThreeLivingNeighbors_whenApplicable_thenReturnFalse() {
        OverpopulationRule overpopulationRule = new OverpopulationRule();

        boolean applicable = overpopulationRule.isApplicable(true, 3);

        assertThat(applicable).isFalse();
    }

    @Test
    public void givenIsDeadAndFourLivingNeighbors_whenApplicable_thenReturnFalse() {
        OverpopulationRule overpopulationRule = new OverpopulationRule();

        boolean applicable = overpopulationRule.isApplicable(false, 4);

        assertThat(applicable).isFalse();
    }
}
