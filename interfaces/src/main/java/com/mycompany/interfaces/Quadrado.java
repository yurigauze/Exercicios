/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;
import java.lang.Math;

/**
 *
 * @author Aluno
 */
public class Quadrado implements AreaCalculavel{

    public double lado;
    
        @Override
    public double calculaArea() {
          
        return this.lado ;
          
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
    

