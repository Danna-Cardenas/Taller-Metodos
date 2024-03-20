/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallermetodos;

/**
 *
 * @author DANNA
 */
public class Ejercicio6 {
    
    public double ConvertirDias (double segundos, String tipo){
        
        double resultado = 0;
        
        switch(tipo.toLowerCase()){
            case "dias":
                resultado = segundos / (24*60*60);
       
                break;
            case "horas":
                resultado = segundos / (60*60);
                
                break;
            case "minutos":
                resultado = segundos/ 60;
                
                break;
        }
        
        return resultado;
    }
    
}
