package practica6;
//Escribe un programa que lea (entrada por teclado) el nombre y los dos apellidos de una persona (en tres cadenas de caracteres diferentes), los pase como parámetros a una función, y ésta debe unirlos y devolver una única cadena. La cadena final la imprimirá el programa por pantalla.

import java.util.Scanner;

public class ej2 {

    public static String nombreCompleto(String nombre, String apellido1, String apellido2){
        String nombreCompleto=nombre+" "+apellido1+" "+apellido2;
        return  nombreCompleto;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre=input.next();
        System.out.println("Ingrese su primer apellido");
        String apellido1=input.next();
        System.out.println("Ingrese su segundo apellido");
        String apellido2=input.next();
        input.close();
        System.out.println(nombreCompleto(nombre, apellido1, apellido2));
    }
    
}
