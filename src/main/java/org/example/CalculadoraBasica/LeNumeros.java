package org.example.CalculadoraBasica;

import java.util.ArrayList;
import java.util.Scanner;

public class LeNumeros {
    public static ArrayList<Integer> preenchimento(ArrayList<Integer> valores) {
        Scanner teclado = new Scanner(System.in);
            System.out.println("Informe a quantidade de números que serão utilizados: ");
            int quant = teclado.nextInt();
            for (int i = 0; i < quant ; i++) {
                System.out.print((i+1) + "º num: ");
                valores.add(teclado.nextInt());
            }

            /*System.out.println("Informe os números desejamos e, ao final, aperte F ");
            if (!teclado.hasNextInt()) {
                break;
            }
            valores.add(teclado.nextInt());*/


        return valores;
    }
}
