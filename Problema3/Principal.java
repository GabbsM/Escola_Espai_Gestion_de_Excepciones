package Problema3;

//Problema 3
//Haz un programa que divida dos números, y controla que el divisor sea distinto de 0. Si no es
//así, lanza una ArithmeticException (es genérica de Java, ya existe)

public class Principal {


    public static void main(String[] args) {

      /*  try {
            int resultado = 4/2;
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
        System.out.println("Finalizado");
    }*/
        Division d = new Division();


        System.out.println();
        System.out.println("Hacemos saltar la excepcion:");
        d.dividir(4, 0);
        System.out.println();
        System.out.println("Salida sin error: " );
        d.dividir(4, 2);

    }
}

