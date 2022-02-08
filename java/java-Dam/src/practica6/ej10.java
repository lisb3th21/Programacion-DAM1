package practica6;

import java.util.Scanner;

public class ej10 {

    public static boolean palindroma(String frase) {
        String fraseReves="";
        for (int i=frase.length()-1; i>=0; i--){
            fraseReves+=frase.charAt(i);

        }

        if (frase.equals(fraseReves)){
            return true;
        }else{
            return false;
        }
    }
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Ingresa la palabra que quieres analizar: ");
    String frase=input.next();
    if (palindroma(frase.toLowerCase())){
        System.out.println("La palabra "+frase+" es palindorma o capicúa");
    }else{
        System.out.println("La palabra "+frase+" no es palindorma o capicúa");
    }
}

    
}
