package org.example.CalculadoraIMC;

import java.util.Scanner;
import static java.lang.Math.round;


public class CalculadoraIMC {
    private float peso;
    private float altura;

    public CalculadoraIMC(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float ResultadoIMC() {
        return round(peso / (altura * altura));
    }

    public String StatusIMC(float imc) {
        if (imc < 16) {
            return "MAGREZA GRAVE";
        } else if (imc <= 16 && imc < 17) {
            return "MAGREZA MODERADA";
        } else if (imc <= 17 && imc < 18.5) {
            return "MAGREZA LEVE";
        } else if (imc <= 18.5 && imc < 25) {
            return "SAUDÁVEL";
        } else if (imc <= 25 && imc < 30) {
            return "SOBREPESO";
        } else if (imc <= 30 && imc < 35) {
            return "OBSIDADE GRAU I";
        } else if (imc <= 35 && imc < 40) {
            return "OBSIDADE GRAU II";
        }
        return null;
    }


    public static void operacoes() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Complete com seus dados ");
        System.out.print("NOME: ");
        String nome = teclado.next();
        System.out.print("IDADE: ");
        int idade = teclado.nextInt();
        System.out.print("PESO: ");
        float peso = teclado.nextFloat();
        System.out.print("ALTURA: ");
        float altura = teclado.nextFloat();

        Usuario adolescente = new Usuario(nome,idade,peso,altura);
        System.out.println("Você, " + adolescente.getNome() + ", que possui " + adolescente.getIdade() + " anos, está com o IMC de " +
                adolescente.getIMC() + " e se enquandra na faixa de " + adolescente.StatusIMC());

    }
}
