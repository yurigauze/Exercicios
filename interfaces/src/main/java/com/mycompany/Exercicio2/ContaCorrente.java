/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Exercicio2;

/**
 *
 * @author Aluno
 */
public class ContaCorrente extends Conta implements Tributavel{
       
    @Override
    public double calculaTributos() {
        
            return super.saldo - (super.saldo * 0.1);
             
    }
    @Override
    public void sacar(double valor) {
        super.saldo =  super.saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        super.saldo =  super.saldo + valor;
    }

    @Override
    public void obterSaldo() {
        System.out.println("Saldo atual" + super.saldo);
    }



}

  
