/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.Exercicio4;

/**
 *
 * @author Aluno
 */
public interface IProdutoFabricado extends IProduto{
    int getNumeroIngredientes();
    IProduto getIngrediente(int numero);
    
}
