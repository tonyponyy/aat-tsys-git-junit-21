package calculadora_test_maven.calculadora_test_maven;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
import calculadora_test_maven.calculadora_test_maven.*;
/**
 * Unit test for simple App.
 */
public class CalculadoraTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void sumaTest() {
        double resultado = Calculadora.calcular(5, 3, "+");
        assertEquals(8, resultado);
    }

    @Test
    public void restaTest() {
        double resultado = Calculadora.calcular(10, 4, "-");
        assertEquals(6, resultado);
    }

    @Test
    public void multiplicacionTest() {
        double resultado = Calculadora.calcular(7, 8, "X");
        assertEquals(56, resultado);
    }

    @Test
    public void divisionTest() {
        double resultado = Calculadora.calcular(12, 3, "/");
        assertEquals(4, resultado);
    }
    @Test
    public void divisionInvalidaTest() {
        double resultado = Calculadora.calcular(9,0, "/");
        assertEquals(0, resultado);
    }
    @Test
    public void divisionInvalidaTest2() {
        double resultado = Calculadora.calcular(0,0, "/");
        assertEquals(0, resultado);
    }

    
    @Test
    public void cambioSignoTest() {
        double resultado = Calculadora.cambiar_signo(7);
        assertEquals(-7, resultado);
    }
    
}
