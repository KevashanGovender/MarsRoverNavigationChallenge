package util;

import model.Instruction;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructionUtilTest {

    @Test
    public void testShouldReturnCorrectInstructionBasedOnInputM(){
        String input = "M";
        Instruction i = InstructionUtil.check(input);

        assertEquals(Instruction.M, i);
    }
    @Test
    public void testShouldReturnCorrectInstructionBasedOnInputL(){
        String input = "L";
        Instruction i = InstructionUtil.check(input);

        assertEquals(Instruction.L, i);
    }

    @Test
    public void testShouldReturnCorrectInstructionBasedOnInputR(){
        String input = "R";
        Instruction i = InstructionUtil.check(input);

        assertEquals(Instruction.R, i);
    }

    @Test
    public void testShouldReturnCorrectInstructionBasedOnInput(){
        String input = "D";
        Instruction i = InstructionUtil.check(input);

        assertEquals(Instruction.D, i);
    }

    @Test
    public void testShouldReturnTrueIfInstructionIsD(){
        assertTrue(InstructionUtil.checkIfDone(Instruction.D));
    }


    @Test
    public void testShouldReturnFalseIfInstructionIsNotD(){
        assertFalse(InstructionUtil.checkIfDone(Instruction.M));
    }

}