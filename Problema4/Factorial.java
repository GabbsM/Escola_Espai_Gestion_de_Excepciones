package Problema4;

import javax.naming.LimitExceededException;
import java.util.Scanner;

public class Factorial extends Exception {

    public void factorial()throws LimiteException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("De que numero quieres saber el factorial?: ");
            int numero = sc.nextInt();

            if(numero < 0 || numero>20){
                throw new LimiteException();
            }

            int factori= 1;
            for (int i = numero; i > 0 ; i--) {
                 factori = factori * i;
                
            }
            System.out.println("El resultado del factorial es " + factori);


        }catch (LimiteException e){
            System.out.println("El numero no puede ser menor que 0 ni mayor que 20");
        }


    }

public static class LimiteException extends Exception{

    }

}


