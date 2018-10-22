package be.cegeka.gameoflife;

import java.util.ArrayList;
import java.util.List;

public class World {

    private List<ArrayList<Boolean>> cells;

    public World(List<ArrayList<Boolean>> cells) {
        this.cells = cells;
    }

    public int getDimension() {
        return cells.size();
    }

    public World getCopy() {
        List<ArrayList<Boolean>> copy = new ArrayList<>();
        for (int i = 0; i < getDimension(); i++) {
            copy.add(new ArrayList<>());
            for (int j = 0; j < getDimension(); j++) {
                copy.get(i).add(this.cells.get(i).get(j));
            }
        }
        return new World(copy);
    }

    public void setCell(int x, int y, boolean value) {
        cells.get(x).set(y, value);
    }

    public boolean getCell(int x, int y) {
        return cells.get(x).get(y);
    }

    public List<ArrayList<Boolean>> getCells() {
        return cells;
    }
}
