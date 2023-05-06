package Exercicio3FixacaoPoo.application;

import Exercicio3FixacaoPoo.entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Digite seu nome: ");
        estudante.nome = sc.nextLine();
        System.out.println("Digite suas três notas: ");
        estudante.grade1 = sc.nextDouble();
        estudante.grade2 = sc.nextDouble();
        estudante.grade3 = sc.nextDouble();

        System.out.println();
        System.out.printf("Nota final: %.2f%n", estudante.notaFinal());

        if (estudante.notaFinal() < 60.0){
            System.out.println("Reprovado!");
            System.out.printf("Falta %.2f pontos", estudante.faltandoPontos());
        }
        else {
            System.out.println("Aprovado!");
        }
        sc.close();
    }
}
