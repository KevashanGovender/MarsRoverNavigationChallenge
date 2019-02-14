package main;

import model.Direction;
import model.Instruction;
import model.Rover;
import util.NavigationUtil;

public class Main {

    public static void main(String args []){

        Rover rover = new Rover();
        rover.setDirection(Direction.EAST);
        rover.setXPos(1);
        rover.setYPos(2);

        NavigationUtil navigationUtil = new NavigationUtil();
        navigationUtil.setRover(rover);

        navigationUtil.move(Instruction.M);
        navigationUtil.move(Instruction.M);
        navigationUtil.move(Instruction.L);
        navigationUtil.move(Instruction.M);
        navigationUtil.move(Instruction.R);
        navigationUtil.move(Instruction.M);
        navigationUtil.move(Instruction.M);
        navigationUtil.move(Instruction.R);
        navigationUtil.move(Instruction.R);
        navigationUtil.move(Instruction.M);
        navigationUtil.move(Instruction.M);
        navigationUtil.move(Instruction.L);

        System.out.println("X = " + rover.getXPos());
        System.out.println("Y = " + rover.getYPos());
        System.out.println("Direction = " + rover.getDirection());
    }
}
