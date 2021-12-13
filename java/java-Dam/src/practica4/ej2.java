package practica4;

import java.util.Scanner;

//Escribe un programa que pida dos números y escriba qué números 
//entre ese par de números son pares y cuáles impares
public class ej2 {
//metodo que ve los numeros pares e impares
    static void pares_imaperes(int num1, int num2){
        String pares="";
        String impares=""; 
        for (int i=num1; i<= num2; i++ ){
            if (i%2==0){
                pares+=i+"-";
            }
            else{
                impares+=i+"-";
            }
            


        }
        System.out.println("############\nLos numeros pares entre "+num1+" y "+num2+" son:\n"+ pares+"\nY los impares son:\n"+ impares);
    }

    public static void main(String[] args) {
        
        Scanner entrada1= new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num1= entrada1.nextInt();
        Scanner entrada2= new Scanner(System.in);
        int num2;
        // creo un bucle do while para que el usuario ingrese el segundo numero mayor a el primero 
        do {
            System.out.println("Ingrese un numero mayor a "+ num1);
            num2= entrada2.nextInt();
        }while(num1>num2);


        entrada1.close();
        entrada2.close();


        pares_imaperes(num1, num2);

        
    }

    
}
