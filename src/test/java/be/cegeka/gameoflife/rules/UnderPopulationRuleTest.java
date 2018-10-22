package be.cegeka.gameoflife.rules;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UnderPopulationRuleTest {

    @Test
    public void whenGetNextStateForCell_thenAlwaysReturnFalse() {
        UnderpopulationRule underPopulationRule = new UnderpopulationRule();

        boolean result = underPopulationRule.getNextStateForCell();

        assertThat(result).isFalse();
    }

    @Test
    public void givenCellIsAliveAndNoLivingNeighbors_whenApplicable_thenReturnTrue() {
        UnderpopulationRule underPopulationRule = new UnderpopulationRule();

        boolean result = underPopulationRule.isApplicable(true, 0);

        assertThat(result).isTrue();
    }

    @Test
    public void givenCellIsAliveAndTwoLivingNeighbors_whenApplicable_thenReturnFalse() {
        UnderpopulationRule underPopulationRule = new UnderpopulationRule();

        boolean result = underPopulationRule.isApplicable(true, 2);

        assertThat(result).isFalse();
    }

    @Test
    public void givenCellIsDeadAndTwoLivingNeighbors_whenApplicable_thenReturnFalse() {
        UnderpopulationRule underPopulationRule = new UnderpopulationRule();

        boolean result = underPopulationRule.isApplicable(false, 2);

        assertThat(result).isFalse();
    }

    @Test
    public void givenCellIsDeadAndNoLivingNeighbors_whenApplicable_thenReturnFalse() {
        UnderpopulationRule underPopulationRule = new UnderpopulationRule();

        boolean result = underPopulationRule.isApplicable(false, 0);

        assertThat(result).isFalse();
    }
}
