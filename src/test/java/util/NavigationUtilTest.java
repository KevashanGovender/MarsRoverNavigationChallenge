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

    @Test
    public void testThatIfRoverDirectionIsEast_AndInstructionIsM_RoverXPosIncreasesBy1(){
        rover.setDirection(Direction.EAST);
        rover.setXPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.M);

        assertEquals(2, rover.getXPos());
    }

    @Test
    public void testThatIfRoverDirectionIsEast_AndInstructionIsL_RoverDirectionIsN(){
        rover.setDirection(Direction.EAST);
        rover.setXPos(1);
        rover.setYPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.L);

        assertEquals(Direction.NORTH, rover.getDirection());
        assertEquals(1, rover.getXPos());
        assertEquals(1, rover.getYPos());
    }

    @Test
    public void testThatIfRoverDirectionIsEast_AndInstructionIsR_RoverDirectionIsS(){
        rover.setDirection(Direction.EAST);
        rover.setXPos(1);
        rover.setYPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.R);

        assertEquals(Direction.SOUTH, rover.getDirection());
        assertEquals(1, rover.getXPos());
        assertEquals(1, rover.getYPos());
    }

    @Test
    public void testThatIfRoverDirectionIsSouth_AndInstructionIsM_RoverYPosDecreasesBy1(){
        rover.setDirection(Direction.SOUTH);
        rover.setXPos(1);
        rover.setYPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.M);

        assertEquals(0, rover.getYPos());
    }

    @Test
    public void testThatIfRoverDirectionIsSouth_AndInstructionIsL_RoverDirectionIsE(){
        rover.setDirection(Direction.SOUTH);
        rover.setXPos(1);
        rover.setYPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.L);

        assertEquals(Direction.EAST, rover.getDirection());
        assertEquals(1, rover.getXPos());
        assertEquals(1, rover.getYPos());
    }

    @Test
    public void testThatIfRoverDirectionIsSouth_AndInstructionIsR_RoverDirectionIsW(){
        rover.setDirection(Direction.SOUTH);
        rover.setXPos(1);
        rover.setYPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.R);

        assertEquals(Direction.WEST, rover.getDirection());
        assertEquals(1, rover.getXPos());
        assertEquals(1, rover.getYPos());
    }

    @Test
    public void testThatIfRoverDirectionIsWest_AndInstructionIsM_RoverXPosDecreasesBy1(){
        rover.setDirection(Direction.WEST);
        rover.setXPos(1);
        rover.setYPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.M);

        assertEquals(0, rover.getXPos());
    }

    @Test
    public void testThatIfRoverDirectionIsWest_AndInstructionIsL_RoverDirectionIsS(){
        rover.setDirection(Direction.WEST);
        rover.setXPos(1);
        rover.setYPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.L);

        assertEquals(Direction.SOUTH, rover.getDirection());
        assertEquals(1, rover.getXPos());
        assertEquals(1, rover.getYPos());
    }

    @Test
    public void testThatIfRoverDirectionIsSouth_AndInstructionIsR_RoverDirectionIsN(){
        rover.setDirection(Direction.WEST);
        rover.setXPos(1);
        rover.setYPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.R);

        assertEquals(Direction.NORTH, rover.getDirection());
        assertEquals(1, rover.getXPos());
        assertEquals(1, rover.getYPos());
    }

    @Test
    public void testThatIfRoverDirectionIsNull_NoInstructionIsExecuted(){
        rover.setDirection(null);
        rover.setXPos(1);
        rover.setYPos(1);

        navigationUtil.setRover(rover);
        navigationUtil.move(Instruction.R);

        assertNull(rover.getDirection());
        assertEquals(1, rover.getXPos());
        assertEquals(1, rover.getYPos());
    }

}