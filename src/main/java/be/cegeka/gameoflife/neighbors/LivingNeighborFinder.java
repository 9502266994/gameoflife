package be.cegeka.gameoflife.neighbors;

import be.cegeka.gameoflife.World;

public class LivingNeighborFinder {

    public int findNumberOfLivingNeighbors(int row, int column, World world) {
        int minimalXCoordinate = Math.max(0, row - 1);
        int maximalXCoordinate = Math.min(row + 1, world.getDimension() - 1);

        int minimalYCoordinate = Math.max(0, column - 1);
        int maximalYCoordinate = Math.min(column + 1, world.getDimension() - 1);

        int numberOfLivingNeighbors = 0;

        for (int i = minimalXCoordinate; i <= maximalXCoordinate; i++) {
            for (int j = minimalYCoordinate; j <= maximalYCoordinate; j++) {
                if (isNotCenterCell(i, j, row, column) &&
                    isAlive(world, i, j)) {
                    numberOfLivingNeighbors++;
                }
            }
        }
        return numberOfLivingNeighbors;
    }

    private boolean isAlive(World world, int i, int j) {
        return world.getCell(i, j);
    }

    private boolean isNotCenterCell(int i, int j, int row, int column) {
        return i != row || j != column;
    }

}
