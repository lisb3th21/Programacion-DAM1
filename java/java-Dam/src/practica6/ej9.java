package practica6;

import java.util.Scanner;

//Escribe un programa que pida dos palabras las pase como parámetro a un procedimiento y diga si riman o no. Si coinciden las tres últimas letras tiene que decir que riman. Si coinciden solo las dos últimas tiene que decir que riman un poco y si no, que no riman.
public class ej9 {

    public static String rima(String palabra1, String palabra2) {
        String rimaMucho = palabra1 + " y " + palabra2 + " riman mucho";
        String rimaPoco = palabra1 + " y " + palabra2 + " riman poco";
        palabra1 = palabra1.substring(palabra1.length() - 3, palabra1.length());
        palabra2 = palabra2.substring(palabra2.length() - 3, palabra2.length());
        if (palabra1.equalsIgnoreCase(palabra2)) {
            return rimaMucho;
        }
        palabra1 = palabra1.substring(palabra1.length() - 2, palabra1.length());
        palabra2 = palabra2.substring(palabra2.length() - 2, palabra2.length());
        if (palabra1.equalsIgnoreCase(palabra2)) {
            return rimaPoco;
        } else {
            return "no riman";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una palaba");
        String palabra1 = input.next();
        System.out.println("Ingrese otra palabra: ");
        String palabra2 = input.next();
        System.out.println(rima(palabra1, palabra2));
        input.close();
    }
}
