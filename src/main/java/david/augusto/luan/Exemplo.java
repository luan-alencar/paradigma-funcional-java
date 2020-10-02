package david.augusto.luan;

import java.util.function.UnaryOperator;

public class Exemplo {

    public int calcularValor() {
        UnaryOperator<Integer> valorCalcular = valor -> valor * 3; // paradigma funcional
        int valor = 10;
        return valorCalcular.apply(valor);
    }

    public double calcularMedia() {
        UnaryOperator<Double> valorCalcular = valor -> ((valor + valor + valor) / 3);
        double valor = 10;
        return valorCalcular.apply(valor);
    }

}
