package be.cegeka.gameoflife;

import org.junit.Test;

import static be.cegeka.gameoflife.WorldTestBuilder.buildCheckerWorld;
import static be.cegeka.gameoflife.WorldTestBuilder.buildOneDimensionalDeadWorld;
import static org.assertj.core.api.Assertions.assertThat;

public class WorldTest {

    @Test
    public void whenGetDimension_thenReturnSizeOfList() {
        World world = buildCheckerWorld();

        int dimension = world.getDimension();

        assertThat(dimension).isEqualTo(3);
    }

    @Test
    public void whenGetCopy_thenReturnCopyOfWorld() {
        World world = buildCheckerWorld();

        World copy = world.getCopy();

        assertThat(copy).isEqualToComparingFieldByField(world);
    }

    @Test
    public void whenSetCell_thenChangeStateOfCorrectCell() {
        World world = buildOneDimensionalDeadWorld();
        assertThat(world.getCell(0, 0)).isFalse();

        world.setCell(0, 0, true);

        assertThat(world.getCell(0, 0)).isTrue();
    }

}
