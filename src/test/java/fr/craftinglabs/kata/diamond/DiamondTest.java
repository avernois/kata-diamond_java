package fr.craftinglabs.kata.diamond;

import static org.junit.Assert.*;
import org.junit.Test;

public class DiamondTest {

    @Test public void 
    should_return_A_diamond() {
        
        assertEquals("A", Diamond.create('A'));
    }

    @Test public void 
    should_return_B_diamond() {
        
        assertEquals(" A \nB B\n A ", Diamond.create('B'));
    }

    @Test public void 
    should_return_C_diamond() {
        assertEquals("  A  \n"
                   + " B B \n"
                   + "C   C\n"
                   + " B B \n"
                   + "  A  ", Diamond.create('C'));
    }

    @Test public void 
    should_return_D_diamond() {
        assertEquals("   A   \n"
                   + "  B B  \n"
                   + " C   C \n"
                   + "D     D\n"
                   + " C   C \n"
                   + "  B B  \n"
                   + "   A   ", Diamond.create('D'));
    }

}
