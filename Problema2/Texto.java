package Problema2;

import java.util.Scanner;

public class Texto {

    public  void deTextoANumero() throws Exception{

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe una frase: ");
            String frase = sc.nextLine();
            int fraseNumero = Integer.parseInt(frase);
            System.out.println(frase);

        }catch (Exception e){
            System.out.println("Numero incorrecto " + e.getMessage());
        }
    }
}
