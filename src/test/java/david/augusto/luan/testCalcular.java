package david.augusto.luan;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class testCalcular {

    @Test
    public void testCalcularValor() {
        Calcular e = new Calcular();
        assertEquals(30, e.calcularValor());
    }

    @Test
    public void testCalcularMedia() {
        Calcular e = new Calcular();
        assertEquals(10, e.calcularValor());
    }

    @Test
    public void testComposicaoDeFuncoes() {
        Calcular c = new Calcular();
        assertEquals(4, 8, c.calcularComposicaoDeFuncoes());
    }

}
