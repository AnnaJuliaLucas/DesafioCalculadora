package org.example;

import org.example.CalculadoraBasica.CalculadoraBasica;
import org.example.CalculadoraGasolina.CalculadoraGasolina;
import org.example.CalculadoraIMC.CalculadoraIMC;
import org.example.CalculadoraImposto.CalculadoraImposto;

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
                    case 3 :
                        CalculadoraImposto.operacoes();
                        break;
                    case 4 :
                       CalculadoraGasolina.operacoes();
                       break;
                    default:
                        System.out.println("Opção invalida! Tente novamente...");
                        return;
                }

                System.out.print("\n Deseja voltar ao menu principal (1) SIM ou (2)NÃO: ");
                int resp = teclado.nextInt();
                if(resp == 1){
                    chamaMenu();
                }else{
                    System.out.println("OBRIGADA POR USAR NOSSA CALCULADORA!");
                }
    }
}
