package util;

import model.Direction;

public class DirectionCheckUtil {

    public static Direction check(String inputDirection){
        inputDirection = inputDirection.toUpperCase();

        if(inputDirection.equals(Direction.NORTH.toString())){
            return Direction.NORTH;
        } else if (inputDirection.equals(Direction.EAST.toString())){
            return Direction.EAST;
        } else if(inputDirection.equals(Direction.SOUTH.toString())){
            return Direction.SOUTH;
        } else if(inputDirection.equals(Direction.WEST.toString())) {
            return Direction.WEST;
        } else {
            System.out.println("Invalid input, shutting down.");
            System.exit(0);
            return Direction.UNKNOWN;
        }
    }
}
