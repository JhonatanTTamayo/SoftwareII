/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_14_pruebas_unitarias;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author jhonatan
 */
class CalculadoraTest {
    private static Calculadora calculadora;

    @BeforeAll
    static void configurar() {
        calculadora = new Calculadora();
    }

    @Test
    void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertNotEquals(6, calculadora.sumar(2, 3));
    }

    @Test
    void testRestar() {
        assertEquals(1, calculadora.restar(3, 2));
        assertNotEquals(0, calculadora.restar(3, 2));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertTrue(calculadora.multiplicar(0, 5) == 0);
    }

    @Test
    void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertFalse(calculadora.dividir(6, 3) == 3);
    }

    @Test
    void testDividirPorCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(5, 0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

    @RepeatedTest(3)
    void testSumarRepetido() {
        assertEquals(10, calculadora.sumar(5, 5));
    }
}
