/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Exercicio2;

/**
 *
 * @author Aluno
 */
public class ContaPoupanca extends Conta{

    @Override
    public void sacar(double valor) {
        super.saldo =  super.saldo - valor;
        System.out.println("Você sacou R$:" + valor);
        System.out.println("Saldo atual R$:" + super.saldo);
    }

    @Override
    public void depositar(double valor) {
        super.saldo =  super.saldo + valor;
        System.out.println("Você depositou R$:" + valor);
        System.out.println("Saldo atual R$:" + super.saldo);
    }

    @Override
    public void obterSaldo() {
        System.out.println("Saldo atual R$:" + super.saldo);
    }
        

    
}
