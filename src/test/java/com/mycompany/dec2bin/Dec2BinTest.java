/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.dec2bin;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Probas  do método obterBinario da clase Dec2Bin
 * @author laura
 */
public class Dec2BinTest {
    
    /**
     * Constructor por defecto
     */
    public Dec2BinTest() {
    }
    
 

    /**
     * Test of obterBinario method, of class Dec2Bin.
     */
    @Test
    public void testObterBinario() {
        System.out.println("obterBinario");
        int decimal = 8;
        String expResult = "1000";
        String result = Dec2Bin.obterBinario(decimal);
        assertEquals(expResult, result);
       
    }

    /**
     *test
     */
    @Test
    public void testObterBinario0() {
        System.out.println("obterBinario");
        int decimal = 0;
        String expResult = "";
        String result = Dec2Bin.obterBinario(decimal);
        assertEquals(expResult, result);
       
    }

    /**
     * test
     */
    @Test
    public void testObterBinario12() {
        System.out.println("obterBinario");
        int decimal = 12;
        String expResult = "1100";
        String result = Dec2Bin.obterBinario(decimal);
        assertEquals(expResult, result);
       
    }
    
}
