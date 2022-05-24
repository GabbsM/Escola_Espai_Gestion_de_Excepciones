package Problema4;

//Problema 4
//Haz una función que calcule el factorial de un número. Por ejemplo, el factorial de 5 es: 5 x 4 x
//3 x 2 x 1. El de 3 es 3 x 2 x 1.
//Si el usuario intenta un factorial de un número < que 0, o que >20, lanza una LimiteException.
//Nota: esta excepción no existe en Java, debes crearla heredando de la clase Exception.

public class Principal {

    public static void main(String[] args) throws Exception {
        Factorial f = new Factorial();
        f.factorial();

    }
}
