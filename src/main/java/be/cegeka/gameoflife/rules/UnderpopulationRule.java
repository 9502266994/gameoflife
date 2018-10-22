package be.cegeka.gameoflife.rules;

public class UnderpopulationRule implements GameOfLifeRule {

    @Override
    public boolean isApplicable(boolean currentStatus, int numberOfLivingNeighbors) {
        return currentStatus && numberOfLivingNeighbors < 2;
    }

    @Override
    public boolean getNextStateForCell() {
        return false;
    }

}
