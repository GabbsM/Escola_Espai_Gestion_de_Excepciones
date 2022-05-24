package Problema7;

import Problema6.Matematicas.Calculo;

import java.util.Scanner;

public class Factorial {

    public void factorial()throws Calculo.LimiteException {
        Scanner sc = new Scanner(System.in);
        boolean salir=false;

        while (salir!=true){
            try {
                System.out.println("Indica el numero del cual quieres saber el factorial: ");
                long numero = sc.nextLong();
                if (numero<0 || numero>20){
                    throw new Calculo.LimiteException();
                }
                long factorial = 1;
                for (long i = numero; i > 0 ; i--) {
                    factorial = factorial * i;

                }
                System.out.println("El factorial de " + numero + " es: " + factorial);
            }catch (Calculo.LimiteException e){
                System.out.println("ERROR: El numero no puede ser menor que cero ni mayor que 20");
            }finally {
                System.out.println("Introduce el numero 0 para salir del programa");
                System.out.println("Indica el numero del cual quieres saber el factorial: ");
                long numero = sc.nextLong();

                 if(numero==0){
                     salir = false;
                     System.out.println("Hasta la proxima!!");
                     System.exit(0);
                 }
            }
        }

    }

    public static class LimiteException extends Exception{

    }
}
