/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java1;

/**
 *
 * @author Precision M6700
 */
public class Java1 {

    public static void main(String[] args) {
         Pessoa objPessoa = new Pessoa();
        
        objPessoa.nome = "Julia";
        objPessoa.idade = 20;
        objPessoa.altura = 1.50f;
        objPessoa.peso = 40.0f;

        System.out.println("Nome: " + objPessoa.nome);
        System.out.println("Idade: " + objPessoa.idade);
        System.out.println("Altura: " + objPessoa.altura);
        System.out.println("Peso: " + objPessoa.peso);

        objPessoa.finalize();
    }
}
