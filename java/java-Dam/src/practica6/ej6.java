package practica6;

import java.util.Scanner;

//Escribe un programa que lea el nombre de una persona y un carácter (entrada por teclado), le pase estos datos a una función que comprobará si dicho carácter está en su nombre. El resultado de dicha función lo imprimirá el programa principal por pantalla.
public class ej6 {
    public static boolean existe(String frase, char caracter) {
        boolean resultado = false;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                resultado = true;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = input.nextLine();
        String buscar = "";
        char caracter = ' ';
        do {
            System.out.println("Ingresa un caracter:");
            buscar = input.nextLine();
            caracter = buscar.charAt(0);

        } while (buscar.length() != 1);
        input.close();
        System.out.println(existe(frase, caracter));
    }

}
