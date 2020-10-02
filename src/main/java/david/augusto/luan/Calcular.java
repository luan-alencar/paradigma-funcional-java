package david.augusto.luan;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class Calcular {

    // funcional
    public int calcularValor() {
        UnaryOperator<Integer> valorCalcular = valor -> valor * 3; // paradigma funcional
        int valor = 10;
        return valorCalcular.apply(valor);
    }

    // funcional
    public int calcularMedia() {
        UnaryOperator<Integer> valorCalcular = valor -> (valor + valor + valor) / 3;
        int valor = 10;
        return valorCalcular.apply(valor);
    }

    // imperativo
    public int calcularComposicaoDeFuncoes() {
        int[] valores = {6, 2, 3, 4, 7};
        AtomicInteger valor = new AtomicInteger();
        Arrays.stream(valores)
                // para cada numero q entrar aqui verifica se o resto da div e igual a 0
                .filter(numero -> numero % 2 == 0)
                // se for multiplica ele por 2
                .map(numero -> numero * 2)
                // depois para cada numero desse de um print
                .forEach(numero -> valor.set(numero));
        return valor.get();
    }

    public boolean testarSeEMaior() {
        BiPredicate<Integer, Integer> verificaSeEMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;
        return verificaSeEMaior.test(13, 12);
    }

    // imutabilidade
    public int imutabilidade() {
        int valor = 10;
        UnaryOperator<Integer> retornarDobro = v -> v * 2;
        return valor;
    }


}
