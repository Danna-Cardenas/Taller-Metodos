/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallermetodos;

/**
 *
 * @author DANNA
 */
public class Ejercicio2 {
    
    public double Perimetro (double ladoA, double ladoB, String Tipocalculo ){
        double resultado = 0;
        
        if(Tipocalculo.equals("perimetro")){
            double Perimetro = (ladoA * 2) + (ladoB * 2);
                    return Perimetro;
        }else if(Tipocalculo.equals("area")){
            double area = ladoA * ladoB;
            return area;
            
        }
        return resultado;
    }
}
    

