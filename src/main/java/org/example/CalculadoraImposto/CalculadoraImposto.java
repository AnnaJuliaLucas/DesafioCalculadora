package org.example.CalculadoraImposto;

import java.util.Scanner;
import static java.lang.Math.round;
import java.text.DecimalFormat;


public class CalculadoraImposto {
    private static double renda;
    private final double[] taxaImposto = {0, 0.075, 0.15, 0.225, 0.275};

    public CalculadoraImposto(double renda) {
        this.renda = renda;
    }

    public double Porcent0(double renda){
        double p = 0.0;
        if(renda <= 1903.98){
            return p;
        } else if (renda > 1903.98 && renda <= 2826.65 ) {
            p = 7.5;
        } else if (renda > 2826.65 && renda <= 3751.05) {
            p = 15.00;
        } else if (renda > 3751.05 && renda <= 4664.68) {
            p = 22.50;
        } else
            p = 27.50;
        return p;
    }

    public double Calcula(){
        double imposto = 0;
        if(renda <= 1903.98){
            return imposto;
        } else if (renda > 1903.98 && renda <= 2826.65){
            imposto = (renda - 1903.98) * taxaImposto[1];
        } else if (renda > 2826.65 && renda <= 3751.05) {
            imposto = (renda - 2826.65) * taxaImposto[2] + (2826.65 - 1903.98) * taxaImposto[1];
        } else if (renda > 3751.05 && renda <= 4664.68) {
            imposto = (renda - 3751.05) * taxaImposto[3] + (3751.05 - 2866.65) * taxaImposto[2] + (2866.65 - 1903.98)
                    * taxaImposto[1];
        } else {
             imposto = (renda - 4664.68) * taxaImposto[4] + (4664.68 - 3751.05) * taxaImposto[3] + (3751.05 - 2866.65)
                     * taxaImposto[2] + (2866.65 - 1903.98) * taxaImposto[1];
        }
        return imposto;
    }

    public double getLiquido() {
        return renda - Calcula() ;
    }

    public double getBruto(){
        return renda;
    }

    public static void operacoes(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Complete com seus dados ");
        System.out.print("NOME: ");
        String nome = teclado.next();
        System.out.print("IDADE: ");
        int idade = teclado.nextInt();
        System.out.print("RENDA: ");
        renda = teclado.nextDouble();
        new CalculadoraImposto(renda);

        Pessoa fisica = new Pessoa(nome, idade, renda);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Você, " + fisica.getNome() + ", que possui " + fisica.getIdade() + " anos, recebe " +
                fisica.getRenda() + " reais BRUTOS POR MÊS, está na faixa de imposto de " + fisica.getPorcento() +
                " % \nE, por isso, receberá LÍQUIDO de R$ " + df.format(fisica.getLiq()));

        fisica.getVerifica();
    }

    public double VerificaImpostoMaior(){
        DecimalFormat df = new DecimalFormat("#.##");
        double impostoPJ = renda * 0.15;
        double impostoPF = Calcula();
        if(impostoPF < impostoPJ){
            System.out.println("Você recebera mais dinheiro como PJ "); // + df.format(impostoPJ) + " (Imposto PF: " + df.format(impostoPF) + " )");
        } else if (impostoPF > impostoPJ) {
            System.out.println("Você recebera mais dinheiro como PF"); //+ df.format(impostoPF)+ " (Imposto PJ: " + df.format(impostoPF) + " )");
        } else{
            System.out.println("Os impostos de renda como PF e PJ são iguais"); // + df.format(impostoPF));
        }
        return impostoPJ;
    }

}







