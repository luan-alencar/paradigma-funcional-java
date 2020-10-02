package david.augusto.luan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testCalcular {

    @Test
    public void testCalcularValor() {
        Exemplo e = new Exemplo();
        assertEquals(30, e.calcularValor());
    }

    @Test
    public void testCalcularMedia() {
        Exemplo e = new Exemplo();
        assertEquals(10, e.calcularValor());
    }

}
