/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialsudoku;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhonny
 */
public class SudokuTest {
    
    public SudokuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testPosibles() {
        System.out.println("posibles");
        int linea = 0;
        int columna = 0;
        Sudoku instance = new Sudoku();
        boolean[] expResult = null;
        boolean[] result = instance.posibles(linea, columna);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMarca() {
        System.out.println("marca");
        int numero = 0;
        int linea = 0;
        int columna = 0;
        boolean usado = false;
        Sudoku instance = new Sudoku();
        instance.marca(numero, linea, columna, usado);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIntenta() {
        System.out.println("intenta");
        int pos = 0;
        Sudoku instance = new Sudoku();
        boolean expResult = false;
        boolean result = instance.intenta(pos);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testImprime() {
        System.out.println("imprime");
        Sudoku instance = new Sudoku();
        instance.imprime();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Sudoku.main(args);
        fail("The test case is a prototype.");
    }
    
}
