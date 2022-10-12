/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Exercicio2;

/**
 *
 * @author Aluno
 */
public abstract class Conta {
	double saldo;

	public double obterSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor) {
		if((this.saldo - valor) >= 0 )
			this.saldo = this.saldo - valor;
		else
			System.out.println("Saldo Insuficiente");
	}
	
}
