/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tallermetodos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DANNA
 */
public class Ejercicio1Test {
    
    public Ejercicio1Test() {
    }

    @Test
    public void testPrecioConDescuento() {
        System.out.println("PrecioConDescuento");
        double precio = 300;
        double descuento = 20;
        Ejercicio1 instance = new Ejercicio1();
        double expResult = 240.0;
        double result = instance.PrecioConDescuento(precio, descuento);
        assertEquals(expResult, result, 0);
        
    }
    @Test
    public void testPrecioConDescuento2() {
        System.out.println("PrecioConDescuento");
        double precio = 10000;
        double descuento = 10;
        Ejercicio1 instance = new Ejercicio1();
        double expResult = 9000.0;
        double result = instance.PrecioConDescuento(precio, descuento);
        assertEquals(expResult, result, 0);
    
}
}
