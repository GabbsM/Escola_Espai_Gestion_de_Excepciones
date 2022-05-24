package Problema8;
import Problema7.Factorial;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

//Problema 8
//Crea un generador de números primos. El programa empezará a generar números entre dos
//números que pedirá desde el teclado. Tanto el primero como el último número, deberán estar
//entre 1 y 100.000.000. Si el primer número es mayor que el último, el programa volverá a pedir
//los números al usuario. Utiliza el método isPrimo de la clase Calculo, hecho en el ejercicio 2.


public class Primo {

    public int factorial(int numero) throws Factorial.LimiteException {
        int resultado = 1;
        if (numero < 0 || numero > 100000000) {
            throw new Factorial.LimiteException();
        }
        for (int i = 1; i < numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public boolean isPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
            return true;
        }
        return false;
    }


    public static class LimitedException extends Exception{

        public String getMessage(){
            return ("Valor fuera de rango");
        }
    }
}