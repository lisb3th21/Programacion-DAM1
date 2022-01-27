package practica6;
//Escribe un programa que lea el nombre de una persona y un carácter (entrada por teclado), le pase estos datos a una función que comprobará si dicho carácter está en su nombre. El resultado de dicha función lo imprimirá el programa principal por pantalla.

import java.util.Scanner;

public class ej8 {
    public static String quitarEspacio (String cadena){
        String resultado="";

        for(int i=0; i<cadena.length(); i++ ){
            if (cadena.charAt(i)==' '){
                
            }else{
                resultado+=cadena.charAt(i);
            }
        }

        return resultado;
    }
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("ingrese una cadena");
    String cadena=input.nextLine();
    System.out.println(quitarEspacio(cadena));
    input.close();
}
    
}
