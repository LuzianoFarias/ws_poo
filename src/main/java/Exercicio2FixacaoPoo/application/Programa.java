package Exercicio2FixacaoPoo.application;

import Exercicio2FixacaoPoo.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.print("Nome: ");
        func.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        func.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        func.imposto = sc.nextDouble();

        System.out.println();
        System.out.printf("Fincionario: " + func);
        System.out.println();
        System.out.print("Qual a porcentagem para aumentar o salário: ");
        double porcentagem = sc.nextDouble();
        func.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + func);
        sc.close();
    }
}
