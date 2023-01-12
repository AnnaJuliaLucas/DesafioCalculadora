package org.example.CalculadoraBasica;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraBasica {
    public static void operacoes() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique a operação: ");
        System.out.println("1- SOMA");
        System.out.println("2- SUBTRAÇÃO");
        System.out.println("3- MULTIPLICAÇÃO");
        System.out.println("4- DIVISÃO");
        int operacao = teclado.nextInt();

        ArrayList<Integer> valores = new ArrayList<Integer>();
        LeNumeros.preenchimento(valores);

        switch (operacao) {
            case 1 -> {
                CalculadoraBasica.Soma(valores);
                break;
            }
            case 2 -> {
                CalculadoraBasica.Subtracao(valores);
                break;
            }
            case 3 -> {
                CalculadoraBasica.Multiplicacao(valores);
                break;
            }
            case 4 -> {
                CalculadoraBasica.Divisao(valores);
                break;
            }
            default -> {
                System.out.println("Opção inválida! Tente novamente...");
                return;
            }

        }


    }

    private static void Soma(ArrayList<Integer> num) {
        int aux = 0;
        for (int i = 0; i < num.size(); i++) {
            aux = aux + num.get(i);
        }
        System.out.println("SOMA = " + aux);
    }

    private static void Subtracao(ArrayList<Integer> num) {
        int aux = num.get(0);
        for (int i = 1; i < num.size(); i++) {
            aux = aux - num.get(i);
        }
        System.out.println("SUBTRAÇÃO = " + aux);
    }

    private static void Multiplicacao(ArrayList<Integer> num) {
        int aux = 1;
        for (int i = 0; i < num.size(); i++) {
            aux = aux * num.get(i);
        }
        System.out.println("MULTIPLICAÇÃO: " + aux);
    }

    private static void Divisao(ArrayList<Integer> num) {
        int aux = num.get(0);
        for (int i = 1; i < num.size(); i++) {
            aux = aux / num.get(i);
        }
        System.out.println("DIVISÃO: " + aux);
    }

}

