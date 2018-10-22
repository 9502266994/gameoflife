package be.cegeka.gameoflife.rules;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReproductionRuleTest {

    @Test
    public void whenGetNextStateForCell_thenAlwaysReturnTrue() {
        ReproductionRule reproductionRule = new ReproductionRule();

        boolean nextSate = reproductionRule.getNextStateForCell();

        assertThat(nextSate).isTrue();
    }

    @Test
    public void givenCellAliveAnd3LivingNeighbors_whenApplicable_thenReturnFalse() {
        ReproductionRule reproductionRule = new ReproductionRule();

        boolean applicable = reproductionRule.isApplicable(true, 2);

        assertThat(applicable).isFalse();
    }

    @Test
    public void givenCellDeadAnd3LivingNeighbors_whenApplicable_thenReturnTrue() {
        ReproductionRule reproductionRule = new ReproductionRule();

        boolean applicable = reproductionRule.isApplicable(false, 3);

        assertThat(applicable).isTrue();
    }

    @Test
    public void givenCellDeadAnd2LivingNeighbors_whenApplicable_thenReturnFalse() {
        ReproductionRule reproductionRule = new ReproductionRule();

        boolean applicable = reproductionRule.isApplicable(false, 2);

        assertThat(applicable).isFalse();
    }

}
