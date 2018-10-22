package be.cegeka.gameoflife;

import java.util.ArrayList;
import java.util.Arrays;

public class WorldTestBuilder {

    public static World buildCheckerWorld() {
        ArrayList<Boolean> rowOne = new ArrayList<>();
        ArrayList<Boolean> rowTwo = new ArrayList<>();
        ArrayList<Boolean> rowThree = new ArrayList<>();
        rowOne.add(true);
        rowOne.add(false);
        rowOne.add(true);
        rowTwo.add(false);
        rowTwo.add(true);
        rowTwo.add(false);
        rowThree.add(true);
        rowThree.add(false);
        rowThree.add(true);
        return new World(Arrays.asList(rowOne, rowTwo, rowThree));
    }

    public static World buildHorizontalBlinkerWorld() {
        ArrayList<Boolean> rowOne = new ArrayList<>();
        ArrayList<Boolean> rowTwo = new ArrayList<>();
        ArrayList<Boolean> rowThree = new ArrayList<>();
        rowOne.add(false);
        rowOne.add(false);
        rowOne.add(false);
        rowTwo.add(true);
        rowTwo.add(true);
        rowTwo.add(true);
        rowThree.add(false);
        rowThree.add(false);
        rowThree.add(false);
        return new World(Arrays.asList(rowOne, rowTwo, rowThree));
    }

    public static World buildOneDimensionalDeadWorld() {
        ArrayList<Boolean> rowOne = new ArrayList<>();
        rowOne.add(false);
        return new World(Arrays.asList(rowOne));
    }
}
