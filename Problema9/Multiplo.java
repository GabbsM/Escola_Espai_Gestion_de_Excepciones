package Problema9;

//Problema 9
//Haz un programa que tras pedir dos números, diga si el mayor es múltiplo del menor.
//Encapsula el proceso de averiguar si un número es múltiplo de otro, en un método que llamarás
//sonMultiplos, que estará en la clase Calculo del paquete matematicas. El programa tendrá que
//ir preguntando pares de números y respondiendo si son múltiplos o no hasta que se introduzca
//el número cero en uno de los números.

import java.util.Scanner;

public class Multiplo {

    public void isMultiplo(){


        while (true){
            int resultado;
            Scanner sc = new Scanner(System.in);
            System.out.println("Numero 1: ");
            int num1 = sc.nextInt();
            System.out.println("Numero 2: ");
            int num2 = sc.nextInt();
            if(num1 == 0 || num2 == 0){
                System.out.println("Los numeros no pueden ser cero. ");
                break;

            }
            int mayor;
            int menor;
            if(num1<num2){
                System.out.println(num2 + " es el numero mayor");
                mayor = num2;
                menor = num1;

            }else {
                System.out.println(num1 + " es el numero mayor");
                mayor=num1;
                menor = num2;
            }
            resultado = mayor%menor;
            if (resultado == 0){
                System.out.println("El " + mayor + " es multiplo de " + menor);
            }else {
                System.out.println("El " + mayor + " NO es multiplo de " + menor);
            }


        }
    }


}
