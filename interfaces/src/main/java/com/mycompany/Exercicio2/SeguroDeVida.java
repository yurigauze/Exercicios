/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Exercicio2;

/**
 *
 * @author Aluno
 */
public class SeguroDeVida implements Tributavel {
	public static final double TAXA = 42;
	private double premio;

	@Override
	public double calculaTributos() {
		return TAXA;
	}

	public double getPremio() {
		return premio;
	}

	public void setPremio(double premio) {
		this.premio = premio;
	}
}