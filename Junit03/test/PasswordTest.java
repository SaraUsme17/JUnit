/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Entidad.PasswordValidator;
import Servicio.PasswordValidatorService;
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
public class PasswordTest {
    
    public PasswordTest() {
    }
    
    PasswordValidatorService pvs;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pvs = new PasswordValidatorService();
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
   public void longmin(){
        assertEquals(false, pvs.longitud(new PasswordValidator("aerf2")));
        assertEquals(true, pvs.longitud(new PasswordValidator("aerf20000")));
        assertNotNull(new PasswordValidator("12").getContrasena());
        assertNull(new PasswordValidator().getContrasena());

   }
   
   @Test
   
   public void caracEspeciales(){
       assertEquals(true, pvs.caractespeciales(new PasswordValidator("aerf2$") ));
       assertNotEquals(false, pvs.caractespeciales(new PasswordValidator("aerf2$")));
        boolean result = pvs.caractespeciales(new PasswordValidator("aerf2"));
        boolean result1 = pvs.caractespeciales(new PasswordValidator("aerf2*"));
        assertFalse(result);
        assertTrue(result1);
   
   }
   
   @Test
   public void mayusC(){
       assertEquals(true, pvs.mayus(new PasswordValidator("aePrf2")));
       assertNotEquals(false, pvs.mayus(new PasswordValidator("aerf2L")));
       assertNull(new PasswordValidator().getContrasena());
       assertNotNull(new PasswordValidator("123").getContrasena());
       boolean res1 = pvs.mayus(new PasswordValidator("000P"));
       assertTrue(res1);
       
   
   
   }

}
