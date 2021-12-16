package practica4;

import java.util.Scanner;

//Proframa que imprime todos los idvisores de un numero
public class ej11 {
    static void divisores(int num){
String resultado="";
        for (int i=1; i<=num; i++){
            if (num%i==0){
                resultado= resultado+ i + "  "; 
            }
        }System.out.println(resultado);
    }
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num= entrada.nextInt();
        entrada.close();
        System.out.println("Los numeros divisibles para "+ num+ " son: ");
        divisores(num);
        
    }
    
}
