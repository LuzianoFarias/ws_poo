package Exercicio3FixacaoPoo.entities;

public class Estudante {

    public String nome;
    public double grade1;
    public double grade2;
    public double grade3;

    public double notaFinal(){
        return grade1  + grade2 + grade3;
    }
    public double faltandoPontos(){
        if (notaFinal() < 60.0){
            return 60.0 - notaFinal();
        }
        else {
            return 0.0;
        }
    }
}
