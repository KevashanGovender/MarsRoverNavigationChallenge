package util;

import model.Direction;
import model.Instruction;
import model.Rover;

import static model.Instruction.*;

public class NavigationUtil {

    private Rover rover;
    private int xBound;
    private int yBound;

    public NavigationUtil(Rover rover, int xBound, int yBound) {
        this.rover = rover;
        this.xBound = xBound;
        this.yBound = yBound;
    }

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
        if(currentYPos == yBound){
            System.out.println("Boundary reached for the cartesian plane");
            return currentYPos;
        } else {
            return currentYPos + 1;
        }
    }

    private int moveRight(int currentXPos){
        if(currentXPos == xBound){
            System.out.println("Boundary reached for the cartesian plane");
            return currentXPos;
        } else {
            return currentXPos + 1;
        }

    }

    private int moveBack(int currentYPos){
        if(currentYPos == 1){
            System.out.println("Boundary reached for the cartesian plane");
            return currentYPos;
        } else {
            return currentYPos - 1;
        }
    }

    private int moveLeft(int currentXPos){
        if(currentXPos == 1){
            System.out.println("Boundary reached for the cartesian plane");
            return currentXPos;
        } else {
            return currentXPos - 1;
        }
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
