package be.cegeka.gameoflife.rules;

public class SustenanceRule implements GameOfLifeRule {

    @Override
    public boolean isApplicable(boolean currentStatus, int numberOfLivingNeighbors) {
        return currentStatus && (numberOfLivingNeighbors == 2 || numberOfLivingNeighbors == 3);
    }

    @Override
    public boolean getNextStateForCell() {
        return true;
    }

}
