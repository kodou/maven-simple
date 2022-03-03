package com.example.simple;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void addStringIntsShouldReturnSumString() { assertTrue(App.addStringInts("3", "4").equals("7")); }

    @Test
    public void addShouldReturnSum() { assertTrue(App.add(3, 4) == 7);}

}
