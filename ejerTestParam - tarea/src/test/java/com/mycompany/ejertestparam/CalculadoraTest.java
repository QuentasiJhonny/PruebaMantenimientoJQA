/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Jhonny
 */
@RunWith(Parameterized.class)
public class CalculadoraTest {

       @Parameterized.Parameters
    
    public static List<Object> datos()
    {
    return Arrays.asList(new Object[][]{{4,2}});
    }
    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public int valor2; 
   
    Calculadora utils = new Calculadora();
    @Test
    public void testSuma() {
        int esperado1=6;
        int resultado= utils.suma(valor1, valor2);
        assertEquals(esperado1,resultado);
        
        
    }

    @Test
    public void testResta() {
         int esperado1=2;
        int resultado= utils.resta(valor1, valor2);
        assertEquals(esperado1,resultado);
    }

    @Test
    public void testMultimplicacion() {
         int esperado1=8;
        int resultado= utils.multimplicacion(valor1, valor2);
        assertEquals(esperado1,resultado);
    }

    @Test
    public void testDivision() {
        int esperado1=2;
        int resultado= utils.division(valor1, valor2);
        assertEquals(esperado1,resultado);
    }
    
}
