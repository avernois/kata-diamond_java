package fr.craftinglabs.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiamondTest {
    
    @Test public void 
    should_draw_diamond_A() {
        assertEquals("A", Diamond.create('A'));
    }
}
