package Problema6.Matematicas;
import java.util.Scanner;

public class Calculo {

    public void factorial()throws LimiteException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Indica el numero del cual quieres saber el factorial: ");
            long numero = sc.nextLong();
            if (numero<0 || numero>20){
                throw new  LimiteException();
            }
            long factorial = 1;
            for (long i = numero; i > 0 ; i--) {
                factorial = factorial * i;

            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }catch (LimiteException e){
            System.out.println("ERROR: El numero no puede ser menor que cero ni mayor que 20");
        }
    }

    public boolean isPrimo() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Indica ahora el numero que quieras saber si es primo o no: ");
        long numero = sc.nextLong();
        for (int i = 2; i < 3; i++) {
            if (numero % i == 0) {

            }
            System.out.println("El numero no es primo");


        }
        return false;

    }



    public static class LimiteException extends Exception{


    }
}
