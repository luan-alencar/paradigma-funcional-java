package david.augusto.luan;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.UnaryOperator;

public class Calcular {

    public int calcularValor() {
        UnaryOperator<Integer> valorCalcular = valor -> valor * 3; // paradigma funcional
        int valor = 10;
        return valorCalcular.apply(valor);
    }

    public double calcularMedia() {
        UnaryOperator<Double> valorCalcular = valor -> (valor + valor + valor) / 3;
        double valor = 10;
        return valorCalcular.apply(valor);
    }

    public int calcularComposicaoDeFuncoes() {
        int[] valores = {1, 2, 3, 4, 5};
        AtomicInteger valor = new AtomicInteger();
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> valor.set(numero));
        return valor.get();
    }

}
