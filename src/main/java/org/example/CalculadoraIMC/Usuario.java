package org.example.CalculadoraIMC;

import java.util.Scanner;

public class Usuario {
    private String nome;
    private int idade;
    private CalculadoraIMC imcCalculadora;


    public Usuario(String nome, int idade, float peso, float altura){
        this.nome = nome;
        this.idade = idade;
        this.imcCalculadora = new CalculadoraIMC(peso,altura);
    }

    public float getIMC (){
        return imcCalculadora.ResultadoIMC();
    }

    public String StatusIMC(){
        return imcCalculadora.StatusIMC(this.getIMC());
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

}
