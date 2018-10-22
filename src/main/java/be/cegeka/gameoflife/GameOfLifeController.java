package be.cegeka.gameoflife;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/gameoflife")
public class GameOfLifeController {

    private static Logger logger = Logger.getLogger(GameOfLifeController.class);

    private Engine engine = new Engine();

    @ResponseBody
    @RequestMapping(value = "/world", method = POST)
    public List<ArrayList<Boolean>> getWorld(@RequestBody List<ArrayList<Boolean>> currentCells) {
        logger.info(currentCells);

        World nextWorld = engine.getNextWorld(new World(currentCells));
        return nextWorld.getCells();
    }
}
