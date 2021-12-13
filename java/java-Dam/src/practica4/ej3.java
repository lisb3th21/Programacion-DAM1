package practica4;
//Escribe un programa que pida dos números y escriba la suma de enteros desde el primero hasta el último.

import java.util.Scanner;

public class ej3 {
    
    static void suma(int num1, int num2){
        int resultado=0;
        for (int i=num1; i<=num2; i++){
            resultado+=i;
        }
        System.out.println("La suma de los enteros desde "+num1+" hasta "+ num2+" es:\n"+resultado);
    }

    public static void main(String[] args) {
        Scanner entrada1= new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1= entrada1.nextInt();
        Scanner entrada2= new Scanner(System.in); 
        int num2;
         
        do{
            System.out.println("Ingrese un número mayor a "+ num1);
            num2 = entrada2.nextInt();
        }while (num1>num2);

        suma(num1, num2);
    }
    
}
