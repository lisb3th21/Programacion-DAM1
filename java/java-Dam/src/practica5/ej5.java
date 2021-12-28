package practica5;

import java.util.ArrayList;
import java.util.Scanner;

/*
Escribe un programa que te pida números cada vez más grandes y que se
guarden en una lista. Para acabar de escribir los números, escribe un
número que no sea mayor que el anterior. El programa termina escribiendo la lista de números:
*/
public class ej5 {
    public static void main(String[] args) {
        ArrayList <Integer>lista= new  ArrayList<Integer>();
        Scanner input= new Scanner(System.in);
        int num; 
        int ultimoNum;
        System.out.println("Ingrese un número");
        num=input.nextInt();
        lista.add(num);
        System.out.println("Ingrese un número mayor a "+ num);
        ultimoNum=input.nextInt();
        lista.add(ultimoNum);

        while(ultimoNum>num){
            num=ultimoNum;
            System.out.println("Ingrese un número mayor a "+ num);
            ultimoNum=input.nextInt();
            lista.add(ultimoNum);
        }
        input.close();
    int longitud= lista.size()-1;
    lista.remove(longitud);
    
        System.out.print("Los numeros ingresados son: ");

        for (int i=0; i<longitud; i++){
            System.out.print(lista.get(i));
            if (i<longitud-1){
                System.out.print(", ");
            }
            else{
                System.out.println(".");
            }
        }
    }
    
}
