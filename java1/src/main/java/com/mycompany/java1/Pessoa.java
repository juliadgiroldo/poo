/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java1;

/**
 *
 * @author Precision M6700
 */
public class Pessoa {

    public String nome;
    public int idade;
    public float altura;
    public float peso;

    // Contrutor
    public Pessoa(){
        System.out.println("Objeto Instanciado!!!");

    }

    // Destruidor
    public void finalize(){
        System.out.println("Objeto Destruido!!!");
    }
}
