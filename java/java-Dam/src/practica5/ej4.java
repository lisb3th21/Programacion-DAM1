package practica5;

import java.util.Scanner;

public class ej4 {
//Escribe un programa que te pida dos números, de manera que el segundo sea
//mayor que el primero. El programa termina escribiendo los dos números tal y como se pide:

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int num1;
        int num2; 

        
        System.out.println("Ingresa un número:");
        num1=input.nextInt();
        do{
            System.out.println("Ingrese un numero mayor a "+ num1);
            num2= input.nextInt();

        }while(num1>=num2);


        System.out.println("Los numeros ingresados son: "+num1 +" y "+ num2);
        input.close();
    }

}
