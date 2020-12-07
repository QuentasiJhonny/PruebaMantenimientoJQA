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
import org.junit.runners.Parameterized;

/**
 *
 * @author Jhonny
 */
public class NumeroPrimoTest {
    
   @Parameterized.Parameters
    
    public static List<Object> datos()
    {
    return Arrays.asList(new Object[][]{{3}});
    }
    @Parameterized.Parameter(0)
    public int valor1;
    
   
    NumeroPrimo utils = new NumeroPrimo();

    @Test
    public void testValidate() {
       
        boolean esperado1=true;
        
        boolean resultado = utils.validate(valor1);
 
        assertEquals(esperado1,resultado);
        }
        
        
        
       }
    

