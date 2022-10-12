/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Exercicio4;

/**
 *
 * @author Aluno
 */
public class Componente implements IProduto {
     private String nome;
    private float custo;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public float getCusto() {
        return this.custo;
    }

}
