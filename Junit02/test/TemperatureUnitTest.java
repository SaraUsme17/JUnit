/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.TemperatureConverter;
import Servicio.TemperatureConverterService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TemperatureUnitTest {
    
    public TemperatureUnitTest() {
    }
    
    TemperatureConverterService tcs;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tcs = new TemperatureConverterService();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void convertirCelsius(){
        //conversor de celsius a Farenheit
        assertEquals(10,tcs.celsius(new TemperatureConverter(50)),0);
        assertEquals(260,tcs.celsius(new TemperatureConverter(500)),0);

    }
    
    @Test
    public void convertirKelvin(){
        assertEquals(273.15, tcs.kelvin(new TemperatureConverter(0)),0);
        
    }
    
    @Test
    public void farnToKel(){
    assertEquals(255.3722222222222, tcs.FtoK(new TemperatureConverter(0)),0);
//        assertNotEquals(0, 0, 0);
    
    }
}
