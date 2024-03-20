/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallermetodos;

/**
 *
 * @author DANNA
 */
public class Ejercicio4 {
    
    public double Perimetro (double radio, String tipodecalculo){
        
        switch (tipodecalculo){
            case "Area":
                return 3.1416*Math.pow(radio, 2);
                
            case "perimetro":
                return 2*(3.1416*radio);
                
            case "volumen":
                return (4*3.1416*Math.pow(radio, 3))/3;
                
            default:
                System.out.println("Esta mal");
                return 0;
                 
                
        }
    }
    
}
