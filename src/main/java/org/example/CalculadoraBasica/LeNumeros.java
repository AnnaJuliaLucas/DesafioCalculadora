package org.example.CalculadoraBasica;

import java.util.ArrayList;
import java.util.Scanner;

public class LeNumeros {
    public static ArrayList<Integer> preenchimento(ArrayList<Integer> valores) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Informe os números desejamos e, ao final, aperte F ");
            if (!teclado.hasNextInt()) {
                break;
            }
            valores.add(teclado.nextInt());

        }
        teclado.close();
        return valores;
    }
}
