package be.cegeka.gameoflife;

import be.cegeka.gameoflife.neighbors.LivingNeighborFinder;
import be.cegeka.gameoflife.rules.GameOfLifeRule;
import be.cegeka.gameoflife.rules.OverpopulationRule;
import be.cegeka.gameoflife.rules.ReproductionRule;
import be.cegeka.gameoflife.rules.SustenanceRule;
import be.cegeka.gameoflife.rules.UnderpopulationRule;

import java.util.Arrays;
import java.util.List;

public class Engine {

    private List<GameOfLifeRule> rules = Arrays.asList(
        new UnderpopulationRule(),
        new OverpopulationRule(),
        new SustenanceRule(),
        new ReproductionRule());

    private LivingNeighborFinder livingNeighborFinder = new LivingNeighborFinder();

    public World getNextWorld(World currentWorld) {
        World nextWorld = currentWorld.getCopy();
        int dimension = currentWorld.getDimension();

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                applyRules(currentWorld, nextWorld, i, j);
            }
        }
        return nextWorld;
    }

    private void applyRules(World currentWorld, World nextWorld, int i, int j) {
        for (GameOfLifeRule rule : rules) {
            int numberOfLivingNeighbors = livingNeighborFinder.findNumberOfLivingNeighbors(i, j, currentWorld);
            boolean cell = currentWorld.getCell(i, j);
            if (rule.isApplicable(cell, numberOfLivingNeighbors)) {
                boolean nextStateForCell = rule.getNextStateForCell();
                nextWorld.setCell(i, j, nextStateForCell);
            }
        }
    }
}
