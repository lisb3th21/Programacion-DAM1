package practica5;

import java.util.ArrayList;
import java.util.Scanner;

/*
Escribe un programa que te pida primero un número y luego te pida
números hasta que la suma de los números introducidos coincida con
el número inicial. El programa termina escribiendo la lista de números.
*/
public class ej8 {
    public static void main(String[] args) {

        int suma, limite, entrada, longitud;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el número que quiere que sea el límite: ");
        limite = input.nextInt();
        suma = 0;
        do {
            System.out.println("Ingrese un número:");
            entrada = input.nextInt();
            lista.add(entrada);
            suma += entrada;
            while (suma > limite) {
                System.out.println("la suma ahora es de:" + suma);
                lista.remove(lista.size() - 1);
                suma -= entrada;

                System.out
                        .println("El numero " + entrada + " ha sumerado el límite.\nIngrese otro numero mas pequeño: ");
                entrada = input.nextInt();
                suma += entrada;
                lista.add(entrada);

            }
        } while (suma < limite);

        longitud = lista.size();
        String listaNumeros = "";
        for (int i = 0; i < longitud; i++) {
            listaNumeros += lista.get(i);

            if (i < longitud - 1) {
                listaNumeros += (", ");
            } else {
                listaNumeros += (".");
            }
        }
        input.close();
        System.out.print(
                "Los numeros que ha ingresado han superado el limite. \nLos números ingresados son: " + listaNumeros);

    }
}
