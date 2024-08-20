/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.pooespol.calculadoraa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author José Miguel
 */
public class CalculadoraaTest {
    
    public CalculadoraaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    //test suma
    @Test
    public void testSuma_TCS01() {
        double a = 3.0;
        double b = 5.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 8.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testSuma_TCS02() {
        double a = 5.0;
        double b = 0.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 5.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testSuma_TCS03() {
        double a = 0.0;
        double b = 0.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 0.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testSuma_TCS04() {
        double a = -3.0;
        double b = -5.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = -8.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testSuma_TCS05() {
        double a = 5.0;
        double b = -5.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 0.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
    }

    // Test Resta
    @Test
    public void testResta_TCR01() {
        double a = 5.0;
        double b = 3.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 2.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testResta_TCR02() {
        double a = 5.0;
        double b = 6.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = -1.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testResta_TCR03() {
        double a = 0.0;
        double b = 0.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 0.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testResta_TCR04() {
        double a = 5.0;
        double b = 5.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 0.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testResta_TCR05() {
        double a = -1.0;
        double b = -1.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 0.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testResta_TCR06() {
        double a = -1.0;
        double b = -2.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 1.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testResta_TCR07() {
        double a = -2.0;
        double b = -1.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = -1.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
    }

    // Test Multiplicación
    @Test
    public void testMultiplicacion_TCM01() {
        double a = 10.0;
        double b = 0.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 0.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicacion_TCM02() {
        double a = 5.0;
        double b = 2.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 10.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicacion_TCM03() {
        double a = -2.0;
        double b = -3.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 6.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicacion_TCM04() {
        double a = -5.0;
        double b = 6.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = -30.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
    }

    // Test División
    @Test
    public void testDivision_TCD01() {
        double a = 5.0;
        double b = 1.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 5.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDivision_TCD02() {
        double a = 5.0;
        double b = 0.0;
        Calculadoraa instance = new Calculadoraa();
        assertThrows(ArithmeticException.class, () -> {
            instance.division(a, b);
        });
    }

    @Test
    public void testDivision_TCD03() {
        double a = 5.0;
        double b = -1.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = -5.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDivision_TCD04() {
        double a = 5.0;
        double b = 2.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 2.5;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDivision_TCD05() {
        double a = 4.0;
        double b = 3.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 1.3333333333333333;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0.0000000000000001);
    }

    // Test Exponenciación
    @Test
    public void testExponenciacion_TCE01() {
        double base = 5.0;
        double exponente = 0.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 1.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testExponenciacion_TCE02() {
        double base = 6.0;
        double exponente = 1.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 6.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testExponenciacion_TCE03() {
        double base = 2.0;
        double exponente = 3.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 8.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testExponenciacion_TCE04() {
        double base = 2.0;
        double exponente = -2.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 0.25;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testExponenciacion_TCE05() {
        double base = -3.0;
        double exponente = 2.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 9.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testExponenciacion_TCE06() {
        double base = 0.0;
        double exponente = 2.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 0.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testExponenciacion_TCE07() {
        double base = 0.0;
        double exponente = -2.0;
        Calculadoraa instance = new Calculadoraa();
        assertThrows(ArithmeticException.class, () -> {
            instance.exponenciacion(base, exponente);
        });
    }

    // Test Radicación
    @Test
    public void testRadicacion_TCRA01() {
        double numero = 16.0;
        double indice = 2.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 4.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testRadicacion_TCRA02() {
        double numero = 7.0;
        double indice = 1.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 7.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testRadicacion_TCRA03() {
        double numero = 0.0;
        double indice = 2.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = 0.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testRadicacion_TCRA04() {
        double numero = -16.0;
        double indice = 2.0;
        Calculadoraa instance = new Calculadoraa();
        assertThrows(ArithmeticException.class, () -> {
            instance.radicacion(numero, indice);
        });
    }

    @Test
    public void testRadicacion_TCRA05() {
        double numero = -27.0;
        double indice = 3.0;
        Calculadoraa instance = new Calculadoraa();
        double expResult = -3.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
    }

    // Test Números Amigos
    @Test
    public void testSonAmigos_TCA01() {
        int a = 220;
        int b = 284;
        Calculadoraa instance = new Calculadoraa();
        boolean expResult = true;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSonAmigos_TCA02() {
        int a = 10;
        int b = 20;
        Calculadoraa instance = new Calculadoraa();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSonAmigos_TCA03() {
        int a = 6;
        int b = 6;
        Calculadoraa instance = new Calculadoraa();
        assertThrows(IllegalArgumentException.class, () -> {
            instance.sonAmigos(a, b);
        });
    }

    @Test
    public void testSonAmigos_TCA04() {
        int a = 0;
        int b = 220;
        Calculadoraa instance = new Calculadoraa();
        assertThrows(IllegalArgumentException.class, () -> {
            instance.sonAmigos(a, b);
        });
    }

    @Test
    public void testSonAmigos_TCA05() {
        int a = -220;
        int b = 284;
        Calculadoraa instance = new Calculadoraa();
        assertThrows(IllegalArgumentException.class, () -> {
            instance.sonAmigos(a, b);
        });
    }

    @Test
    public void testSonAmigos_TCA06() {
        int a = 1;
        int b = 2;
        Calculadoraa instance = new Calculadoraa();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
    }
    //test de divisores
    // Test Suma de Divisores para diferentes valores
    @Test
    public void testSumaDivisores_TCSD01() {
        double x = 6.0;
        Calculadoraa instance = new Calculadoraa();
        int expResult = 6;  // 1 + 2 + 3 = 6
        int result = instance.sumaDivisores((int)x);
        assertEquals(expResult, result);
    }

    @Test
    public void testSumaDivisores_TCSD02() {
        double x = 28.0;
        Calculadoraa instance = new Calculadoraa();
        int expResult = 28;  // 1 + 2 + 4 + 7 + 14 = 28
        int result = instance.sumaDivisores((int)x);
        assertEquals(expResult, result);
    }

    @Test
    public void testSumaDivisores_TCSD03() {
        int x = 1;
        Calculadoraa instance = new Calculadoraa();
        assertThrows(IllegalArgumentException.class, () -> {
            instance.sumaDivisores(x);
        });
    }
    
    @Test
    public void testSumaDivisores_TCSD04() {
        int x = 0;
        Calculadoraa instance = new Calculadoraa();
        assertThrows(IllegalArgumentException.class, () -> {
            instance.sumaDivisores(x);
        });
    }


}
