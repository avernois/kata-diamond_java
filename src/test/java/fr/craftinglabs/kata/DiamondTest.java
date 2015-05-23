package fr.craftinglabs.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiamondTest {
    
    @Test public void 
    should_draw_diamond_A() {
        assertEquals("A", Diamond.create('A'));
    }

    @Test public void 
    should_draw_diamond_B() {
        assertEquals(" A \nB B\n A ", Diamond.create('B'));
    }
}
