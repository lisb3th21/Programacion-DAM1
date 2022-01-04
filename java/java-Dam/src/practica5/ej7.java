package practica5;

import java.util.ArrayList;
import java.util.Scanner;

/*
Escribe un programa que pida un número (límite) y luego te pida números hasta que la suma de
los números introducidos supere el límite inicial. El programa termina escribiendo la lista
de números.
*/

public class ej7 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int  maximo, entrada, total;
        ArrayList<Integer> lista= new ArrayList<Integer>();

        System.out.println("Ingrese el número al que quiera llegar: ");
        maximo= input.nextInt();
        total=0;
        do{
            System.out.println("Ingrese un número: ");
            entrada= input.nextInt();
            lista.add(entrada);
            total+=entrada;
        }while (total<maximo);

        

System.out.print("Los numeros que ha ingresado han superado el limite de "+ maximo+". \nLos números ingresados son: ");
int longitud=lista.size();
        for (int i = 0; i < longitud; i++) {
            System.out.print(lista.get(i));
            if (i < longitud - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
    }
    System.out.println("La suma tota es de "+total);
}
}