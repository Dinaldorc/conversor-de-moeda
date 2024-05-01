package br.com.alura.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {

            System.out.println("###############################################");
            System.out.println("Seja bem-vindo(a) ao Conversor de Moeda\n");

            exibirMenu();

            System.out.println("Escolha uma opção de conversão acima: ");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    ConverterMoeda.converter("BRL", "CAD");
                    break;
                case 2:
                    ConverterMoeda.converter("CAD", "BRL");
                    break;
                case 3:
                    ConverterMoeda.converter("BRL", "ZAR");
                    break;
                case 4:
                    ConverterMoeda.converter("ZAR", "BRL");
                    break;
                case 5:
                    ConverterMoeda.converter("BRL", "AUD");
                    break;
                case 6:
                    ConverterMoeda.converter("AUD", "BRL");
                    break;
                case 7:
                    ConverterMoeda.converter("BRL", "EUR");
                    break;
                case 8:
                    ConverterMoeda.converter("EUR", "BRL");
                    break;
                case 9:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Favor, escolha umsa opção de 1 a 08 ou 09 para sair");

            }

        }
        input.close();
    }

        public static void exibirMenu() {
                System.out.println("1. Real Brasileiro >>>>> Dólar Canadense");
                System.out.println("2. Dólar Canadense >>>>> Real Brasileiro");
                System.out.println("3. Real Brasileiro >>>>> RAND (África do Sul)");
                System.out.println("4. RAND (África do Sul) >>>>> Real Brasileiro");
                System.out.println("5. Real Brasileiro >>>>> Dólar Australiano");
                System.out.println("6. Dólar Australiano >>>>> Real Brasileiro");
                System.out.println("7. Real Brasileiro >>>>> EURO");
                System.out.println("8. EURO >>>>> Real Brasileiro\n");
                System.out.println("9. Sair");
            }


}

