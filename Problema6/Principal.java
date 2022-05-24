package Problema6;

//Problema 6
//Crea un paquete llamado matematicas, en el que escribirás una clase llamada Calculo con dos
//métodos. El primero de los métodos se llamará factorial y calculará él factorial de un número.
//El método factorial deberá lanzar una excepción, a la que llamarás LimiteException, en el caso
//de que el número a calcular sea menor que 0 ó mayor que 20. El segundo de los métodos
//devolverá true si el número es primo y false en caso contrario, llámalo isPrimo. Ambos
//métodos deben utilizar el mismo atributo long para realizar sus operaciones.

import Problema6.Matematicas.Calculo;

public class Principal {

    public static void main(String[] args) throws Calculo.LimiteException {

        Calculo c = new Calculo();
        c.factorial();
        c.isPrimo();

    }
}
