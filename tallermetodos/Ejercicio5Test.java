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
public class Ejercicio5Test {
    
    public Ejercicio5Test() {
    }

    @Test
    public void testConvertirSegundos() {
        System.out.println("ConvertirSegundos");
        int dias = 30;
        int horas = 5;
        int minutos = 17;
        int segundos = 38;
        Ejercicio5 instance = new Ejercicio5();
        int expResult = 2611020;
        int result = instance.ConvertirSegundos(dias, horas, minutos, segundos);
        assertEquals(expResult, result);
    }
    @Test
    public void testConvertirSegundos2() {
        System.out.println("ConvertirSegundos");
        int dias = 24;
        int horas = 16;
        int minutos = 07;
        int segundos = 11;
        Ejercicio5 instance = new Ejercicio5();
        int expResult = 2131620;
        int result = instance.ConvertirSegundos(dias, horas, minutos, segundos);
        assertEquals(expResult, result);
    }
}
