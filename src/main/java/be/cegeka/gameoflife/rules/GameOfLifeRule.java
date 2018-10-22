package be.cegeka.gameoflife.rules;

public interface GameOfLifeRule {

    boolean isApplicable(boolean currentStatus, int numberOfLivingNeighbors);

    boolean getNextStateForCell();
}
