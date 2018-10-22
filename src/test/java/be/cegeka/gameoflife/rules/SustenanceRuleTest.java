package be.cegeka.gameoflife.rules;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SustenanceRuleTest {

    @Test
    public void whenGetNextStateForCell_thenAlwaysReturnTrue() {
        SustenanceRule sustenanceRule = new SustenanceRule();

        boolean result = sustenanceRule.getNextStateForCell();

        assertThat(result).isTrue();
    }

    @Test
    public void givenCellAliveAnd2LivingNeighbors_whenApplicable_thenReturnTrue() {
        SustenanceRule sustenanceRule = new SustenanceRule();

        boolean applicable = sustenanceRule.isApplicable(true, 2);

        assertThat(applicable).isTrue();
    }

    @Test
    public void givenCellAliveAnd3LivingNeighbors_whenApplicable_thenReturnTrue() {
        SustenanceRule sustenanceRule = new SustenanceRule();

        boolean applicable = sustenanceRule.isApplicable(true, 3);

        assertThat(applicable).isTrue();
    }

    @Test
    public void givenCellAliveAnd4LivingNeighbors_whenApplicable_thenReturnFalse() {
        SustenanceRule sustenanceRule = new SustenanceRule();

        boolean applicable = sustenanceRule.isApplicable(true, 4);

        assertThat(applicable).isFalse();
    }

    @Test
    public void givenCellDeadAnd2LivingNeighbors_whenApplicable_thenReturnFalse() {
        SustenanceRule sustenanceRule = new SustenanceRule();

        boolean applicable = sustenanceRule.isApplicable(false, 2);

        assertThat(applicable).isFalse();
    }

    @Test
    public void givenCellDeadAnd3LivingNeighbors_whenApplicable_thenReturnFalse() {
        SustenanceRule sustenanceRule = new SustenanceRule();

        boolean applicable = sustenanceRule.isApplicable(false, 3);

        assertThat(applicable).isFalse();
    }

}
