package ExercicioFixacaoEstaticos.util;

public class ConversorMoeda {

    public static final double IOF = 0.06;

    public  static double conversorDolar(double cotacaoDolar,double dolarComprado){
        return cotacaoDolar * dolarComprado * (1.0 + IOF);
    }
}
