package david.augusto.luan;

import java.util.function.UnaryOperator;

public class Exemplo {

    public static void main(String[] args) {
        UnaryOperator<Integer> valorCalcular = valor -> valor * 3;
        int valor = 10;
        System.out.println(valorCalcular.apply(valor));
    }
}
