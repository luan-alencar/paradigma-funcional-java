package david.augusto.luan;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testCalcular {

    @Test
    public void testCalcularValor() {
        Calcular e = new Calcular();
        assertEquals(30, e.calcularValor());
    }

    @Test
    public void testCalcularMedia() {
        Calcular e = new Calcular();
        assertEquals(10, e.calcularMedia());
    }

    @Test
    public void testComposicaoDeFuncoes() {
        Calcular c = new Calcular();
        assertTrue((c.calcularComposicaoDeFuncoes() % 2 == 0) ? true : false);
    }
}
