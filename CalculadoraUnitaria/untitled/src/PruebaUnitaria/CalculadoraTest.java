import PruebaUnitaria.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(10, calc.sumar(8, 2));
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(18, calc.restar(20, 2));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(25, calc.multiplicar(5, 5));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.dividir(30, 2));
    }
}
