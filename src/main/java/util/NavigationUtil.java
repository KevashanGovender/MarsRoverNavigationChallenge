package util;

import model.Direction;
import model.Instruction;
import model.Rover;

import static model.Instruction.*;

public class NavigationUtil {

    private Rover rover;

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public void move(Instruction instruction) {
        if(rover.getDirection() != null){
            switch (rover.getDirection()) {
                case NORTH: handleNorth(instruction);
                    break;
                case EAST: handleEast(instruction);
                    break;
                case SOUTH: handleSouth(instruction);
                    break;
                case WEST: handleWest(instruction);
            }
        } else {
            System.out.println("Direction is null");
        }
    }

    private int moveForward(int currentYPos) {
        return currentYPos + 1;
    }

    private int moveRight(int currentXPos){
        return currentXPos + 1;
    }

    private int moveBack(int currentYPos){
        return currentYPos - 1;
    }

    private int moveLeft(int currentXPos){
        return currentXPos - 1;
    }

    private void handleNorth(Instruction instruction){
        switch (instruction){
            case M : rover.setYPos(moveForward(rover.getYPos()));
            break;
            case L: rover.setDirection(Direction.WEST);
            break;
            case R: rover.setDirection(Direction.EAST);
            break;
        }
    }

    private void handleEast(Instruction instruction){
        switch (instruction){
            case M : rover.setXPos(moveRight(rover.getXPos()));
                break;
            case L: rover.setDirection(Direction.NORTH);
                break;
            case R: rover.setDirection(Direction.SOUTH);
                break;
        }
    }

    private void handleSouth(Instruction instruction){
        switch (instruction){
            case M : rover.setYPos(moveBack(rover.getYPos()));
                break;
            case L: rover.setDirection(Direction.EAST);
                break;
            case R: rover.setDirection(Direction.WEST);
                break;
        }
    }

    private void handleWest(Instruction instruction){
        switch (instruction){
            case M : rover.setXPos(moveLeft(rover.getXPos()));
                break;
            case L: rover.setDirection(Direction.SOUTH);
                break;
            case R: rover.setDirection(Direction.NORTH);
                break;
        }
    }
}
