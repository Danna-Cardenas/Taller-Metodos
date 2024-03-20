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
public class Ejercicio4Test {
    
    public Ejercicio4Test() {
    }

    @Test
    public void testPerimetro() {
        System.out.println("Perimetro");
        double radio = 2;
        String tipodecalculo = "volumen";
        Ejercicio4 instance = new Ejercicio4();
        double expResult = 33.5104;
        double result = instance.Perimetro(radio, tipodecalculo);
        assertEquals(expResult, result, 0);
    }
     @Test
    public void testPerimetro2() {
        System.out.println("Perimetro");
        double radio = 15;
        String tipodecalculo = "perimetro";
        Ejercicio4 instance = new Ejercicio4();
        double expResult = 94.248;
        double result = instance.Perimetro(radio, tipodecalculo);
        assertEquals(expResult, result, 0);
}
}