package practica5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Escribe un programa que te pida números y
los guarde en una lista. Para terminar de
introducir número, simplemente escribe “Salir”.
El programa termina escribiendo la lista de  números.

*/
public class ej2 {
    public static void main(String[] args) {
        List<String> listaNumeros=new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String num="";
        String regex= "\\d+";

        do{
            System.out.println("Ingrese un numero que quiera almacenar:");
            num=input.nextLine();
            if (!num.equalsIgnoreCase("salir") && num.matches(regex)){
                listaNumeros.add(num);
            }
        }while (!num.equalsIgnoreCase("salir"));
        input.close();
        System.out.println("\n \n \n Los numeros que ha guardado son: \n"+listaNumeros);
    }
}
