package org.example.CalculadoraGasolina;

import java.util.Scanner;

public class CalculadoraGasolina {
    public static void CalculaGasolina(float kmLitro, float kmRodado, float valorGasolina) {
        float litrosNecessarios = kmRodado/kmLitro;
        float valorGasto = litrosNecessarios * valorGasolina;
        System.out.println("Você precisará abastacer " + litrosNecessarios + " litros para realizar a viagem");
        System.out.println("O valor gasto será de R$ " + valorGasto);
    }

    public static void CalculaAlcool(float kmLitro, float kmRodado, float valorAlcool){
        float litrosNecessarios = kmRodado/kmLitro;
        float valorGasto = litrosNecessarios * valorAlcool;
        System.out.println("Você precisará abastacer " + litrosNecessarios + " litros para realizar a viagem");
        System.out.println("O valor gasto será de R$ " + valorGasto);
    }

    public static void CombustivelVantajoso(float valorG, float valorA){
        float aux = valorA/valorG;
        if(aux < 0.7){
            System.out.println("O álcool é mais vantajoso");
        } else{
            System.out.println("A gasolina é mais vantojosa");
        }
    }

    public static void operacoes() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Preencha os dados abaixo: ");
        System.out.print("VALOR DA GASOLINA: ");
        float valorGasolina = teclado.nextFloat();
        System.out.print("VALOR DO ALCOOL: ");
        float valorAlcool = teclado.nextFloat();

        System.out.print("O COMBUSTIVÉL SERÁ (1)GASOLINA OU (2) ALCOOL: ");
        int combustivel = teclado.nextInt();

        System.out.print("QUANTOS km/l O CARRO FAZ: ");
        float quant = teclado.nextFloat();
        System.out.print("QUANTOS km VOCÊ DEVERÁ PERCORRER: ");
        float kmCorridos = teclado.nextFloat();

        System.out.print("VIAGEM (1)SÓ DE IDA  OU  (2)IDA E VOLTA: ");
        int viagem = teclado.nextInt();

        CombustivelVantajoso(valorGasolina,valorAlcool);

        switch (viagem) {
            case 1:
                if(combustivel==1){
                    CalculaGasolina(quant, kmCorridos, valorGasolina);
                    break;
                } else{
                    CalculaAlcool(quant, kmCorridos, valorAlcool);
                    break;}
            case 2:
                if(combustivel==1){
                    CalculaGasolina(quant, kmCorridos*2, valorGasolina);
                    break;
                } else{
                    CalculaAlcool(quant, +kmCorridos*2, valorAlcool);
                    break;}
            default:
                System.out.println("Opção invalida! Tente novamente...");
                return;
        }





    }
}
