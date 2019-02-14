package main;

import model.Instruction;
import model.Rover;
import util.DirectionCheckUtil;
import util.InstructionUtil;
import util.NavigationUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("Welcome to the navigation console for the mars rover");
        System.out.println("----------------------------------------------------");

        System.out.println("I'm going to ask you for some information and at the end of it I will give you the new position of the rover on mars");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        System.out.println("What is the x limit for the cartesian plane the rover will be navigating?");
        int xBound = scanner.nextInt();
        System.out.println("----------------------------------------------------");

        System.out.println("What is the y limit for the cartesian plane the rover will be navigating?");
        int yBound = scanner.nextInt();
        System.out.println("----------------------------------------------------");

        System.out.println("What is the x value for the rover's location");
        int xPos = scanner.nextInt();
        System.out.println("----------------------------------------------------");

        System.out.println("What is the y value for the rover's location");
        int yPos = scanner.nextInt();
        System.out.println("----------------------------------------------------");

        System.out.println("What is the direction the rover is facing? Please enter either NORTH, EAST, SOUTH or WEST");
        String startingDirection = scanner.next();


        Rover rover = new Rover();
        rover.setDirection(DirectionCheckUtil.check(startingDirection));
        rover.setXPos(xPos);
        rover.setYPos(yPos);

        NavigationUtil navigationUtil = new NavigationUtil(rover, xBound, yBound);
        navigationUtil.setRover(rover);

        while (true){
            System.out.println("Please enter your instruction, either M, L, R, D(done)");
            Instruction instruction = InstructionUtil.check(scanner.next());
            if(InstructionUtil.checkIfDone(instruction)){
                break;
            } else {
                navigationUtil.move(instruction);
            }
        }

        System.out.println("Rovers x postion = " + rover.getXPos());
        System.out.println("Rovers y postion = " + rover.getYPos());
        System.out.println("Direction = " + rover.getDirection());
    }
}
