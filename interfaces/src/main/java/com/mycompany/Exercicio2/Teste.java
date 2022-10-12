/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Exercicio2;

import com.mycompany.Exercicio2.ContaCorrente;

/**
 *
 * @author Aluno
 */
public class Teste {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        Tributavel[] listaDeTributaveis = new Tributavel[10];
        listaDeTributaveis[0] = conta;
        listaDeTributaveis[1] = conta;
        listaDeTributaveis[2] = conta;
        listaDeTributaveis[3] = conta;
        listaDeTributaveis[0] = conta;

        GerenciadorDeImpostoDeRenda gdr = new GerenciadorDeImpostoDeRenda();

        double total = gdr.somarValores(listaDeTributaveis);

    }

}
