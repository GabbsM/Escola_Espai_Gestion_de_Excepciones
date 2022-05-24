package Problema1;

//Problema 1
//Haz un programa que lea un texto por teclado, y lo pase a número (usa para ello el método
//Integer.parseInt()). Prueba con los siguientes datos:
//- 15
//- Dieciséis
//¿Qué sucede en cada caso, y por qué?

public class Principal {
    public static void main(String[] args) {

        TextoANumero n = new TextoANumero();

        n.deTextoANumero();

        //RESPUESTA:

        //Si escribo "15" el programa imprime 15, sin embargo si escribo "Dieciseis", salta una excepcion
        // que se llama NumberFormatException.
        //Esto es debido a que el programa esta esperando un entero .
    }
}
