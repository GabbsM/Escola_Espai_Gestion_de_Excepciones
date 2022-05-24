package Problema7;

//Problema 7
//Haz un programa que tras pedir un número entero, calcule su factorial. Utiliza el método
//factorial de la clase Calculo, hecho en el ejercicio anterior. Maneja la excepción
//LimiteExcepcion que lanza el método factorial, con la estructura try… catch…finally. Haz que
//se puedan ir introduciendo sucesivos cálculos hasta que se introduzca la cifra 0 (cero).

import Problema6.Matematicas.Calculo;

public class Principal {

    public static void main(String[] args) throws Calculo.LimiteException {

        Factorial f = new Factorial();
        f.factorial();

        // TODO: 23/05/2022  arreglar la parte del bucle while para evitar que pida dos veces el numero. 

    }
}
