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
public class Ejercicio6Test {
    
    public Ejercicio6Test() {
    }

    @Test
    public void testConvertirDias() {
        System.out.println("ConvertirDias");
        double segundos = 31;
        String tipo = "horas";
        Ejercicio6 instance = new Ejercicio6();
        double expResult = 0.008611111111111111;
        double result = instance.ConvertirDias(segundos, tipo);
        assertEquals(expResult, result, 0);
    }
      @Test
    public void testConvertirDias2() {
        System.out.println("ConvertirDias");
        double segundos = 17;
        String tipo = "minutos";
        Ejercicio6 instance = new Ejercicio6();
        double expResult = 0.2833333333333333;
        double result = instance.ConvertirDias(segundos, tipo);
        assertEquals(expResult, result, 0);
    }
}
