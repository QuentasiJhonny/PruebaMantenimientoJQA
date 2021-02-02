/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.boleto.app.service;

import com.com470.boleto.app.dao.BoletoDao;
import com.com470.boleto.app.entities.Boleto;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Jhonny
 */
public class BoletoServiceTest {
     private static Boleto boleto = new Boleto();
    private static int Id = 1;
    private static String Email = "jorge.perez@gmail.com";

    ArrayList<Boleto> iterable = new ArrayList<Boleto>(); 
    
    @Mock
    private static BoletoDao boletoDao;

    @InjectMocks
    private static BoletoService boletoService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    public BoletoServiceTest() {
    }

    @Test
    public void testCreateBoleto() {
        
        Boleto boleto = new Boleto();

        boleto.setBoletoId(1);

        boleto.setNombreDelPasajero("Jorge Perez");

        boleto.setSalida("Sucre");

        boleto.setDestino("Potosi");

        boleto.setFecha(new Date());

        boleto.setEmail("jorge.perez@gmail.com");

        Mockito.when(boletoDao.save(boleto)).thenReturn(boleto);
        
         Boleto respuesta = boletoService.createBoleto(boleto);

        assertEquals(respuesta, boleto);
        
    }

   @Test
    public void getBoletoByIdTest() {

        final Boleto boleto = new Boleto();

        boleto.setBoletoId(1);

        boleto.setNombreDelPasajero("Jorge Perez");

        boleto.setSalida("Sucre");

        boleto.setDestino("Potosi");

        boleto.setFecha(new Date());

        boleto.setEmail("jorge.perez@gmail.com");

        Mockito.when(boletoDao.findOne(Id)).thenReturn(boleto);

        Boleto respuesta = boletoService.getBoletoById(1);

        assertEquals(respuesta, boleto);
        assertEquals(respuesta.getBoletoId(), boleto.getBoletoId());
        assertEquals(respuesta.getEmail(), boleto.getEmail());
        assertEquals(respuesta.getFecha(), boleto.getFecha());
        assertEquals(respuesta.getNombreDelPasajero(), boleto.getNombreDelPasajero());
        assertEquals(respuesta.getSalida(), boleto.getSalida());
        assertEquals(respuesta.getDestino(), boleto.getDestino());

    }

    @Test
    public void updateBoletoTest() {

        Mockito.when(boletoDao.findOne(Id)).thenReturn(boleto);
        Boleto response = boletoService.updateBoleto(Id, Email);

        assertEquals(response, boletoDao.save(boleto));
    }

    @Test
    public void getAllBoletoTest() {
        Mockito.when(boletoDao.findAll()).thenReturn(iterable);
        Iterable<Boleto> respuesta = boletoService.getAllBoletos();

    }

    @Test
    public void deleteBoletoTest() {
        boletoService.deleteBoleto(Id);
        Mockito.verify(boletoDao, Mockito.times(1)).delete(Id);
    }
    
}
