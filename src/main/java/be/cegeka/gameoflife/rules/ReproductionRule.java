package be.cegeka.gameoflife.rules;

public class ReproductionRule implements GameOfLifeRule {

    @Override
    public boolean isApplicable(boolean currentStatus, int numberOfLivingNeighbors) {
        return !currentStatus && numberOfLivingNeighbors == 3;
    }

    @Override
    public boolean getNextStateForCell() {
        return true;
    }

}
