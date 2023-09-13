/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.PasswordValidator;

/**
 *
 * @author user
 */
public class PasswordValidatorService {
    
    public boolean longitud(PasswordValidator pv){
        boolean res = true;
        
        //longitud mínima 8 caracteres 
        if(pv.getContrasena().length()<8){
            System.out.println("La contraseña no tiene el mínimo de caracteres");
            res = false;
        
        }else{
            System.out.println("La contraseña tiene el mínimo de caracteres esperado");
        
        }
        
        return res;
    
    
    
    }
    
    public boolean caractespeciales(PasswordValidator pv){
        
        boolean carac= false;
        
        for (int i = 0; i < pv.getContrasena().length(); i++) {
            
            if (pv.getContrasena().substring(i, i+1).contentEquals("$") || pv.getContrasena().substring(i, i+1).contentEquals("*") ) {
                carac = true;   
        }

        }
        
        return carac;
    
    
    }
        
    public boolean mayus(PasswordValidator pv) {
        boolean res = false;

        for (int i = 0; i < pv.getContrasena().length(); i++) {
            char caracter = pv.getContrasena().charAt(i);

            if (Character.isUpperCase(caracter)) {
                res = true;

            }
        }
        return res;

    }
}
