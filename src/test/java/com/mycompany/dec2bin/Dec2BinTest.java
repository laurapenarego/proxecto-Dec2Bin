/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.dec2bin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author laura
 */
public class Dec2BinTest {
    
    public Dec2BinTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Dec2Bin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Dec2Bin.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterBinario method, of class Dec2Bin.
     */
    @Test
    public void testObterBinario() {
        System.out.println("obterBinario");
        int decimal = 2;
        String expResult = "10";
        String result = Dec2Bin.obterBinario(decimal);
        assertEquals(expResult, result);
       
    }
    
}
