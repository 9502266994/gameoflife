package be.cegeka.gameoflife.neighbors;

import org.junit.Test;

import static be.cegeka.gameoflife.WorldTestBuilder.buildCheckerWorld;
import static org.assertj.core.api.Assertions.assertThat;

public class LivingNeighborFinderTest {

    @Test
    public void givenUpperRightCell_whenFindNumberOfLivingNeighbors_thenReturnCorrectAmount() {
        LivingNeighborFinder livingNeighborFinder = new LivingNeighborFinder();

        int numberOfLivingNeighbors = livingNeighborFinder.findNumberOfLivingNeighbors(0, 0, buildCheckerWorld());

        assertThat(numberOfLivingNeighbors).isEqualTo(1);
    }

    @Test
    public void givenLowerLeftCell_whenFindNumberOfLivingNeighbors_thenReturnCorrectAmount() {
        LivingNeighborFinder livingNeighborFinder = new LivingNeighborFinder();

        int numberOfLivingNeighbors = livingNeighborFinder.findNumberOfLivingNeighbors(2, 2, buildCheckerWorld());

        assertThat(numberOfLivingNeighbors).isEqualTo(1);
    }

    @Test
    public void givenCenterCell_whenFindNumberOfLivingNeighbors_thenReturnCorrectAmount() {
        LivingNeighborFinder livingNeighborFinder = new LivingNeighborFinder();

        int numberOfLivingNeighbors = livingNeighborFinder.findNumberOfLivingNeighbors(1, 1, buildCheckerWorld());

        assertThat(numberOfLivingNeighbors).isEqualTo(4);
    }

    @Test
    public void givenMiddleLowerCell_whenFindNumberOfLivingNeighbors_thenReturnCorrectAmount() {
        LivingNeighborFinder livingNeighborFinder = new LivingNeighborFinder();

        int numberOfLivingNeighbors = livingNeighborFinder.findNumberOfLivingNeighbors(2, 1, buildCheckerWorld());

        assertThat(numberOfLivingNeighbors).isEqualTo(3);
    }
}
