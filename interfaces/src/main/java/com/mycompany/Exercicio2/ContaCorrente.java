/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Exercicio2;

/**
 *
 * @author Aluno
 */
public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double calculaTributos() {
        return obterSaldo() * 0.01;
    }

}
