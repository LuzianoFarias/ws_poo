package ExercicioFixacaoEstaticos.application;

import ExercicioFixacaoEstaticos.util.ConversorMoeda;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o preço do dólar? ");
        double cotacaoDolar = sc.nextDouble();
        System.out.print("Quantos dólares serão comprados? ");
        double dolarComprado = sc.nextDouble();

        System.out.println();
        System.out.printf("Valor a ser pago em reais = %.2f%n", ConversorMoeda.conversorDolar(cotacaoDolar, dolarComprado));
        sc.close();
    }
}
