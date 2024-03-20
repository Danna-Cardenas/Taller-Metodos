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
public class Ejercicio2Test {
    
    public Ejercicio2Test() {
    }

    @Test
    public void testPerimetro() {
        System.out.println("Perimetro");
        double ladoA = 5;
        double ladoB = 6;
        String Tipocalculo = "perimetro";
        Ejercicio2 instance = new Ejercicio2();
        double expResult = 22;
        double result = instance.Perimetro(ladoA, ladoB, Tipocalculo);
        assertEquals(expResult, result, 0);
    }
     @Test
    public void testPerimetro2() {
        System.out.println("Perimetro");
        double ladoA = 10;
        double ladoB = 20;
        String Tipocalculo = "area";
        Ejercicio2 instance = new Ejercicio2();
        double expResult = 200;
        double result = instance.Perimetro(ladoA, ladoB, Tipocalculo);
        assertEquals(expResult, result, 0);
    }
}
