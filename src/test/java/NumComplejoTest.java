/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Jhonny
 */
@RunWith(Parameterized.class)
public class NumComplejoTest {
	
 @Parameterized.Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{
            {8, 3},{7, 1},{6, 2},{22, 4},{18, 4}
            
        });
    }
	
     int parteEntera;
     int parteImaginaria;
 
    public NumComplejoTest(int a, int b) {
        this.parteEntera = a;
        this.parteImaginaria = b;
    }

	@Test
	public void testSumar() {
		NumComplejo complejo = new NumComplejo(1, 1);
		
		NumComplejo resultado = complejo.sumar(new NumComplejo(parteEntera, parteImaginaria));
		NumComplejo esperado = new NumComplejo(parteEntera + 1, parteImaginaria + 1);
		
		assertEquals(resultado.getParteReal(), esperado.getParteReal());
		assertEquals(resultado.getParteImaginaria(), esperado.getParteImaginaria());
	}

	@Test
	public void testRestar() {
		NumComplejo complejo = new NumComplejo(1, 1);
		
		NumComplejo resultado = complejo.restar(new NumComplejo(parteEntera, parteImaginaria));
		NumComplejo esperado = new NumComplejo(1 - parteEntera, 1 - parteImaginaria);
		
		assertEquals(resultado.getParteReal(), esperado.getParteReal());
		assertEquals(resultado.getParteImaginaria(), esperado.getParteImaginaria());
	}

}


    

