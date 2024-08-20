/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pooespol.calculadoraa;
/**
 *
 * @author José Miguel
 */
public class Calculadoraa {

    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public double exponenciacion(double base, double exponente) {
        if (base == 0 && exponente < 0) {
            throw new ArithmeticException("No se puede elevar cero a un exponente negativo");
        }
        return Math.pow(base, exponente);
    }

    public double radicacion(double numero, double indice) {
    if (numero < 0 && indice % 2 == 0) {
        throw new ArithmeticException("No se puede calcular la raíz par de un número negativo");
    } else if (numero < 0 && indice % 2 != 0) {
        return -Math.pow(-numero, 1.0 / indice);
    } else {
        return Math.pow(numero, 1.0 / indice);
    }
}


    public boolean sonAmigos(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Los números deben ser positivos y diferentes de cero");
        }
        if (a == b) {
            throw new IllegalArgumentException("Los números no deben ser iguales");
        }
        return sumaDivisores(a) == b && sumaDivisores(b) == a;
    }

    public int sumaDivisores(int x) {
    if (x <= 1) {
        throw new IllegalArgumentException("El número debe ser mayor que uno");
    }
    int suma = 0;
    for (int i = 1; i < x; i++) {  // Excluye el propio número
        if (x % i == 0) {
            suma += i;  // Suma el divisor
        }
    }
    return suma;
}




    }
