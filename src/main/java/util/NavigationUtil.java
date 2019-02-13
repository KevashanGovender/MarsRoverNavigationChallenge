package util;

import model.Direction;
import model.Instruction;
import model.Rover;

public class NavigationUtil {

    private Rover rover;
    private Direction roverCurrentDirection;

    public void setRover(Rover rover) {
        this.rover = rover;
        roverCurrentDirection = rover.getDirection();
    }

    public void move(Instruction instruction) {
        if (roverCurrentDirection == Direction.NORTH && instruction == Instruction.M){
            rover.setYPos(moveForward(rover.getYPos()));
        }

        if(roverCurrentDirection == Direction.NORTH && instruction == Instruction.L){
            rover.setDirection(Direction.WEST);
        }

        if(roverCurrentDirection == Direction.NORTH && instruction == Instruction.R){
            rover.setDirection(Direction.EAST);
        }
    }

    private int moveForward(int currentYPos) {
        return currentYPos + 1;
    }
}
