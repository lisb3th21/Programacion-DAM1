package practica5;

import java.util.ArrayList;
import java.util.Scanner;
/*
Escribe un programa que pida primero dos números (máximo y mínimo)
 y que después te pida números intermedios. Para terminar de escribir 
 números, escribe un número que no esté comprendido entre los dos 
 valores iniciales. El programa termina escribiendo la lista de números.
*/
public class ej6 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        // CREAMOS LOS OBJETOS INTEGER QUE UTILIZAREMOS :)
        int mininmo, maximo, numero;

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        mininmo = input.nextInt();
        System.out.println("Ingrese un número mayor a " + mininmo);
        maximo = input.nextInt();

        while (mininmo > maximo) {
            System.out.println(maximo + " no es mayor que " + mininmo + ". Vuelva aprobar: ");
            maximo = input.nextInt();
        }

        do {
            System.out.println("Escriba numeros entre " + mininmo + " y " + maximo);
            numero = input.nextInt();
            lista.add(numero);
        } while (maximo > numero && mininmo < numero);
        int longitud = lista.size() - 1;
        lista.remove(longitud);
        System.out.print("Los numeros ingresados son: ");

        for (int i = 0; i < longitud; i++) {
            System.out.print(lista.get(i));
            if (i < longitud - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
input.close();
        }
    }
}
