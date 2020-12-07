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
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Jhonny
 */
@RunWith(Parameterized.class)

public class TrianguloTest {
    @Parameterized.Parameters
    
    public static List<Object> datos()
    {
    return Arrays.asList(new Object[][]{{2,2,2},{2,2,3},{2,3,4},{12,10,12},{3,8,1},{2,3,7}});
    }
    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public int valor2;
    @Parameterized.Parameter(2)
    public int valor3;
      
    Triangulo utils =new Triangulo();
   

    @Test
    public void testTipoTriangulo() {
       
    String esperado1="Equilatero";
    String esperado2="Isoceles";
    String esperado3="Escaleno";
        System.out.println("los parametros son l1= " +valor1+" l2= " +valor2+ " l3 ="+valor3);
    
        String resultado= utils.tipoTriangulo(valor1, valor2, valor3);
        if(valor1==valor2 && valor2==valor3)
        {
            //resultado Equilatero
            assertEquals(esperado1, resultado);
        }
        else if(valor1==valor2 || valor1==valor3 || valor2== valor3)
        {
            //resultado Isoceles;
            assertEquals(esperado2, resultado);
        }
        else if(valor1!=valor2 || valor1!=valor3 || valor2!= valor3)
        {
            //resultado Escaleno;
            assertEquals(esperado3, resultado);
        }
    }
    
}
