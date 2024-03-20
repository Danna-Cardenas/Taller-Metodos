/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallermetodos;

/**
 *
 * @author DANNA
 */
public class Ejercicio5 {
    
    public int ConvertirSegundos (int dias, int horas, int minutos, int segundos){
        
        int segundosDias = 24*60*60;
        int segundosHoras = 60*60;
        int segundosMinutos = 60;
        int Totalsegundos = (dias*segundosDias)+(horas*segundosHoras)+(minutos*segundosMinutos);
        return Totalsegundos;
    }
    
}
