package be.cegeka.gameoflife;

import org.junit.Test;

import static be.cegeka.gameoflife.WorldTestBuilder.buildHorizontalBlinkerWorld;
import static org.assertj.core.api.Assertions.assertThat;

public class EngineTest {

    @Test
    public void givenHorizontalBlinkerWorld_whenGetNextWorld_thenReturnVerticalBlinker() {
        Engine engine = new Engine();
        World horizontalBlinkerWorld = buildHorizontalBlinkerWorld();

        assertThat(horizontalBlinkerWorld.getCell(0, 0)).isFalse();
        assertThat(horizontalBlinkerWorld.getCell(0, 1)).isFalse();
        assertThat(horizontalBlinkerWorld.getCell(0, 2)).isFalse();
        assertThat(horizontalBlinkerWorld.getCell(1, 0)).isTrue();
        assertThat(horizontalBlinkerWorld.getCell(1, 1)).isTrue();
        assertThat(horizontalBlinkerWorld.getCell(1, 2)).isTrue();
        assertThat(horizontalBlinkerWorld.getCell(2, 0)).isFalse();
        assertThat(horizontalBlinkerWorld.getCell(2, 1)).isFalse();
        assertThat(horizontalBlinkerWorld.getCell(2, 2)).isFalse();

        World nextWorld = engine.getNextWorld(buildHorizontalBlinkerWorld());

        assertThat(nextWorld.getCell(0, 0)).isFalse();
        assertThat(nextWorld.getCell(0, 1)).isTrue();
        assertThat(nextWorld.getCell(0, 2)).isFalse();

        assertThat(nextWorld.getCell(1, 0)).isFalse();
        assertThat(nextWorld.getCell(1, 1)).isTrue();
        assertThat(nextWorld.getCell(1, 2)).isFalse();

        assertThat(nextWorld.getCell(2, 0)).isFalse();
        assertThat(nextWorld.getCell(2, 1)).isTrue();
        assertThat(nextWorld.getCell(2, 2)).isFalse();
    }
}
