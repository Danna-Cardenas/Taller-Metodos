/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallermetodos;

/**
 *
 * @author DANNA
 */
public class Ejercicio1 {
    
    public double PrecioConDescuento (double precio,double descuento){
        
        double Totaldescuento = (precio * descuento)/100;
        double PrecioFinal = precio - Totaldescuento;
        
        return PrecioFinal;
    }
    
}
