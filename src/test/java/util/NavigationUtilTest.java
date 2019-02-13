package util;

import model.Direction;
import model.Instruction;
import model.Rover;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NavigationUtilTest {

    private Rover rover;
    private NavigationUtil navigationUtil;

    @Before
    public void setUp(){
        rover = new Rover();

        navigationUtil = new NavigationUtil();
    }

    @Test
    public void testThatIfRoverDirectionIsNorth_AndInstructionIsM_RoverYPosIncreasesBy1(){
        rover.setDirection(Direction.NORTH);
        rover.setYPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.M);

        assertEquals(2, rover.getYPos());
    }

    @Test
    public void testThatIfRoverDirectionIsNorth_AndInstructionIsL_RoverDirectionIsW(){
        rover.setDirection(Direction.NORTH);
        rover.setXPos(1);
        rover.setYPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.L);

        assertEquals(Direction.WEST, rover.getDirection());
        assertEquals(1, rover.getXPos());
        assertEquals(1, rover.getYPos());
    }

    @Test
    public void testThatIfRoverDirectionIsNorth_AndInstructionIsR_RoverDirectionIsE(){
        rover.setDirection(Direction.NORTH);
        rover.setXPos(1);
        rover.setYPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.R);

        assertEquals(Direction.EAST, rover.getDirection());
        assertEquals(1, rover.getXPos());
        assertEquals(1, rover.getYPos());
    }

}