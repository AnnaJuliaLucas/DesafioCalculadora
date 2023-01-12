package org.example;

import org.example.CalculadoraBasica.CalculadoraBasica;
import org.example.CalculadoraIMC.CalculadoraIMC;

import java.util.Scanner;

        public class Menu {
            public static void chamaMenu() {
                Scanner teclado = new Scanner(System.in);

                System.out.println("Escolha uma das opções abaixo:");
                System.out.println("1- CALCULADORA BÁSICA");
                System.out.println("2- CALCULADORA IMC");
                System.out.println("3- CALCULADORA IMPOSTO DE RENDA");
                System.out.println("4- CALCULADORA GASOLINA");

                int escolha = teclado.nextInt();

                switch (escolha){
                    case 1 :
                        CalculadoraBasica.operacoes();
                        break;
                    case 2 :
                        CalculadoraIMC.operacoes();
                        break;
                    //case 3 -> CalculadoraImpostoDeRenda.operacoes();
                    //case 4 -> CalculadoraGasolina.operacoes();
                    default:
                        System.out.println("Opção invalida! Tente novamente...");
                        return;
                }
    }
}
