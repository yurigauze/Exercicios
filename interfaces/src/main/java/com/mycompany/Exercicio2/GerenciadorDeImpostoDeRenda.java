/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Exercicio2;

/**
 *
 * @author Aluno
 */
public class GerenciadorDeImpostoDeRenda implements Tributavel {

    private double total;

    public double somarValores(Tributavel[] listaDeTributaveis) {
        this.total = 0;
        for (int i = 0; i < listaDeTributaveis.length; i++) {
            this.total = this.total + listaDeTributaveis[i].calculaTributos();
        }
        return this.total;
    }

    public void adicionar(Tributavel tributavel) {
        this.total = this.total + tributavel.calculaTributos();
    }

    @Override
    public double calculaTributos() {
        return 0;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
