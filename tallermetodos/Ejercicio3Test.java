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
public class Ejercicio3Test {
    
    public Ejercicio3Test() {
    }

    @Test
    public void testCambioDeMoneda() {
        System.out.println("CambioDeMoneda");
        double numerodolar = 2500;
        Ejercicio3 instance = new Ejercicio3();
        double expResult = 1876.172607879925;
        double result = instance.CambioDeMoneda(numerodolar);
        assertEquals(expResult, result, 0);
    }
     @Test
    public void testCambioDeMoneda2() {
        System.out.println("CambioDeMoneda");
        double numerodolar = 34000;
        Ejercicio3 instance = new Ejercicio3();
        double expResult = 25515.947467166978;
        double result = instance.CambioDeMoneda(numerodolar);
        assertEquals(expResult, result, 0);
    }
}


