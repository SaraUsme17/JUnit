/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.TemperatureConverter;

/**
 *
 * @author user
 */
public class TemperatureConverterService {
    
    public double celsius(TemperatureConverter tc){
        
        double cel = (tc.getTemperatura()-32)/1.8;
        
        return cel;
    
    
    }
    
    public double kelvin(TemperatureConverter tc){
        
        double kel = (tc.getTemperatura()+273.15);
        return kel;
    
    }
    
    public double FtoK(TemperatureConverter tc){
    
        double kelvin = (tc.getTemperatura()-32)*(5.0/9)+273.15;
        return kelvin;
    
    }
}
