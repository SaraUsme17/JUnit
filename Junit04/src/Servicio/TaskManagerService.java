/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.TaskManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class TaskManagerService {
    
    ArrayList <TaskManager> lista = new ArrayList <>();
    
    public void agregar(TaskManager tm){
        

        lista.add(tm);
        
//            for(TaskManager cli: lista){
//
//            System.out.println(cli.toString());
        
        }
    
//        public List<String> listTasks() {
//        return new ArrayList<>(lista);
//    }
    
    
    }


    
//    public void eliminar(int pos){
//        boolean eliminado = lista.removeIf(cli -> cli.getId()== pos);
//
//    }


