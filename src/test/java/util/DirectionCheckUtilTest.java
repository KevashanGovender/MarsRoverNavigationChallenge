package util;

import model.Direction;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectionCheckUtilTest {

    @Test
    public void testShouldReturnCorrectDirectionBasedOnInputNorth(){
        String inputStringDirection = "NORTH";

        Direction outputDirection = DirectionCheckUtil.check(inputStringDirection);

        assertEquals(Direction.NORTH, outputDirection);
    }

    @Test
    public void testShouldReturnCorrectDirectionBasedOnInputEAST(){
        String inputStringDirection = "EAST";

        Direction outputDirection = DirectionCheckUtil.check(inputStringDirection);

        assertEquals(Direction.EAST, outputDirection);
    }

    @Test
    public void testShouldReturnCorrectDirectionBasedOnInputSOUTH(){
        String inputStringDirection = "SOUTH";

        Direction outputDirection = DirectionCheckUtil.check(inputStringDirection);

        assertEquals(Direction.SOUTH, outputDirection);
    }

    @Test
    public void testShouldReturnCorrectDirectionBasedOnInputWest(){
        String inputStringDirection = "WEST";

        Direction outputDirection = DirectionCheckUtil.check(inputStringDirection);

        assertEquals(Direction.WEST, outputDirection);
    }

}