/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.TaskManager;
import Servicio.TaskManagerService;
import java.util.ArrayList;
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
public class TaskTest {
    
    public TaskTest() {
    }
    
    TaskManagerService tms;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tms = new TaskManagerService();
        ArrayList <TaskManager> lista = new ArrayList <>();
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
    
    public void agregar(ArrayList <TaskManager> lista){
        
        

          TaskManager t1 = new TaskManager("Tarea 1",1);
          tms.agregar(t1);
          tms.agregar(new TaskManager("Tarea 2",2));
          tms.agregar(new TaskManager("Tarea 3",3));
          
          assertEquals(3,lista.size());
    
    }
}
