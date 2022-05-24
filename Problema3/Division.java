package Problema3;

public class Division {

    public void dividir(int num1, int num2) {

        try{
            int resultado = num1/num2;
            System.out.println("El resultado es correcto: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("ERROR: Ninguno de los dos numeros puede ser cero");
        }

    }
}
