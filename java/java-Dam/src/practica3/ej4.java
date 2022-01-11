package practica3;
//Pida al usuario tres números y un cuarto número, y compruebe si este último es divisor de los tres números primeros.

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        System.out.println("Programa para analizar si unos numeros son divisibles ");
        Scanner num1= new Scanner(System.in);
        Scanner num2= new Scanner(System.in);
        Scanner num3= new Scanner(System.in);
        Scanner num4= new Scanner(System.in);

        int nume1, nume2, nume3, nume4;
        System.out.println("Ingrese un número: ");
        nume1= num1.nextInt();

        System.out.println("Ingrese un número: ");
        nume2= num2.nextInt();

        System.out.println("Ingrese un número: ");
        nume3= num3.nextInt();

        System.out.println("Ingrese un número para ver si los anteriores son divisibles: ");
        nume4= num4.nextInt();


        if ( nume4%nume1==0 && nume4%nume2==0 && nume4%nume3==0){
            System.out.println("Los numeros "+ nume1+", "+ nume2+", "+nume3+" son divisibles para "+nume4);
        }
        else{
            System.out.println("Los numeros "+ nume1+", "+ nume2+", "+nume3+" no son divisibles para "+ nume4);
        }
        num1.close();
        num2.close();
        num3.close();
        num4.close();
    }
}
