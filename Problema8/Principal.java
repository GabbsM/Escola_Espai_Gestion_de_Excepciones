package Problema8;

//Problema 8
//Crea un generador de números primos. El programa empezará a generar números entre dos
//números que pedirá desde el teclado. Tanto el primero como el último número, deberán estar
//entre 1 y 100.000.000. Si el primer número es mayor que el último, el programa volverá a pedir
//los números al usuario. Utiliza el método isPrimo de la clase Calculo, hecho en el ejercicio 2.

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) throws Exception {
        // TODO: 23/05/2022 : Arreglar este problema.No saca un random correcto entre dos cifras.
        Primo p = new Primo();
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        do {
            System.out.println("Introduce el primero numero");
            num1 = sc.nextInt();
            System.out.println("Introduce el segundo numero");
            num2 = sc.nextInt();

        }while (num1>num2 ||    num1<1 || num2>100000000);
        for (int i = num1; i<num2; i++){
            if(p.isPrimo(i)){
                System.out.println(i + " ");
            }
        }
    }
}
