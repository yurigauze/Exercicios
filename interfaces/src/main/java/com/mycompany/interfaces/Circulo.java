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
public class Circulo implements AreaCalculavel{
    public double raio;

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    


}