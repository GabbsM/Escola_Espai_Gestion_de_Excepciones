package Problema1;

import java.util.Scanner;

public class TextoANumero {


    public  void deTextoANumero(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = sc.nextLine();
        int fraseNumero = Integer.parseInt(frase);
        System.out.println(frase);
    }


}
