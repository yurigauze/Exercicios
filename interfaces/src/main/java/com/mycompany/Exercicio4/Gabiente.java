/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Exercicio4;

/**
 *
 * @author Aluno
 */
public class Gabiente implements IProdutoFabricado {
    private String nome;
    private float custo;
    private int numeroDeIngrediente;
    private Componentes[] componentes = new Componentes[20];

    @Override
    public int getNumeroIngredientes() {
        return this.numeroDeIngrediente;
    }

    @Override
    public IProduto getIngrediente(int numero) {
        return this.componentes;    
    }
 

    @Override
    public String getNome() {
        return this.nome;    }

    @Override
    public float getCusto() {
        return this.custo;
    }


    
}
