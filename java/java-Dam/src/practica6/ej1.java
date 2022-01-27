package practica6;

import java.util.Scanner;

//Escribe un programa que pida un texto por pantalla, este texto lo pase como parámetro a un procedimiento, y éste lo imprima primero todo en minúsculas y luego todo en mayúsculas.
public class ej1 {

    public static String mayuscula(String cadena){
        return cadena.toUpperCase();
    }
    public static String minuscula (String cadena){
        return cadena.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Ingresa un texto: ");
        String cadena= input.nextLine();
        input.close();

        System.out.println("\n"+mayuscula(cadena));
        System.out.println(minuscula(cadena));
    }
    
}
