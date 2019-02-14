package util;

import model.Instruction;

public class InstructionUtil {

    public static Instruction check(String input){
        input = input.toUpperCase();

        if(input.equals(Instruction.M.toString())){
            return Instruction.M;
        } else if(input.equals(Instruction.L.toString())){
            return Instruction.L;
        } else if(input.equals(Instruction.R.toString())) {
            return Instruction.R;
        } else {
            return Instruction.D;
        }
    }

    public static boolean checkIfDone(Instruction instruction){
        return instruction == Instruction.D;
    }
}
