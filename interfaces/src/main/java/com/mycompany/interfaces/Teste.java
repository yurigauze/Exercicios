/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Teste {
    public static void main(String[] args) {
        AreaCalculavel[] area = new AreaCalculavel[5];
        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();
       
        quadrado.setLado(2);
        area[0] = quadrado;
        
        circulo.setRaio(5);
        area[1] = circulo;
        
        retangulo.setAltura(10);
        retangulo.setBase(5);
        area[2] = retangulo;
        
        circulo.setRaio(15);
        area[3] = circulo;
        
        quadrado.setLado(20);
        area[4] = quadrado;
        
        for (AreaCalculavel areaCalculavel : area) {
            System.out.println(areaCalculavel.calculaArea());
        }

                
        
    }
    
}
