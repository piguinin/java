/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calsimple;
import java.lang.Math;        
     
public class OP {
    
    public double result;
    
    public void calSuma(double n1, double n2) {
        result = n1 + n2;
    }
    
    public void calResta(double n1, double n2) {
        result = n1 - n2;
    }
    
    public void calDividir(double n1, double n2) {
        if (n2 != 0) {
            result = n1 / n2;
        } else {
            // Manejar división por cero
            result = Double.NaN; // Not a Number
        }
    }
    
    public void calMultiplicar(double n1, double n2) {
        result = n1 * n2;
    }
    
    public void calPotencia(double n1, double n2) {
        result = Math.pow(n1, n2); 
    }
    
    public void calRaiz(double n1) {
        if (n1 >= 0) {
            result = Math.sqrt(n1);
        } else {
            // Manejar raíz de número negativo
            result = Double.NaN;
        }
    }
    
    public void calLog(double n1) {
        if (n1 > 0) {
            result = Math.log(n1);
        } else {
            // Manejar logaritmo de número negativo o cero
            result = Double.NaN;
        }
    }
    
    public void calPorcentaje(double n1, double n2) {
        // n1 es el número, n2 es el porcentaje
        result = n1 * (n2 / 100);
    }
    
    // Método alternativo para calcular qué porcentaje es n1 de n2
    public void calPorcentajeEntre(double n1, double n2) {
        if (n2 != 0) {
            result = (n1 / n2) * 100;
        } else {
            result = Double.NaN;
        }
    }
}