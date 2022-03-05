package practica6;

import java.util.Scanner;

public class ej12 {
    public static int contarPalabras(String frase){
        int contadorPalabras=0;
        String listaFrase[]=frase.split("\s+");
        contadorPalabras=listaFrase.length;
        return contadorPalabras;
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingresa la palabra que quieres analizar: ");
        String frase=input.nextLine();
        System.out.println("La frase que ha ingresado tiene "+contarPalabras(frase)+" palabras");
        input.close();
        
    } 
}
