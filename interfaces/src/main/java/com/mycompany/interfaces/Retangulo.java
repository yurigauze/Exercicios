/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author Aluno
 */
public class Retangulo implements AreaCalculavel{
    
    public double base;
    public double altura;

    @Override
    public double calculaArea() {
        return this.base * this.altura;
    }
    
}
