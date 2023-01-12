package org.example.CalculadoraImposto;

public class Pessoa {
    private String nome;
    private int idade;
    private CalculadoraImposto calculadoraImposto;


    public Pessoa(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.calculadoraImposto = new CalculadoraImposto(salario);
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getImposto (){
        return calculadoraImposto.Calcula();
    }

    public double getRenda(){
        return calculadoraImposto.getBruto();
    }

    public double getLiq(){
        return calculadoraImposto.getLiquido();
    }

    public double getPorcento(){
        return calculadoraImposto.Porcent0(getRenda());
    }

}
